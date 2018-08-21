package leetcode;

import java.util.Stack;

public class Code_122_BestTimetoBuyandSellStockII {
    public static int maxProfit1(int[] prices) {
        return buy(prices, -1, 0, 0, false);
    }

    public static int buy(int[] arr, int c, int i, int earned, boolean keep) {
        if (i >= arr.length) {
            return earned;
        }
        if (keep) { // 持有
            // 卖 or 不卖
            return Math.max(
                    buy(arr, -1, i + 1, earned + arr[i] - arr[c], false),
                    buy(arr, c, i + 1, earned, true)
            );
        } else {
            // 买 or 不买
            return Math.max(
                    buy(arr, i, i + 1, earned, true),
                    buy(arr, -1, i + 1, earned, false)
            );
        }
    }


    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int size = prices.length;
        int res = 0;
        int min = prices[0];
        stack.push(min);
        for (int i = 0; i < size; i++) {
            if (!stack.empty() && stack.peek() > prices[i]) {
                res += stack.pop() - min;
                while (!stack.empty()) {
                    stack.pop();
                }
                min = prices[i];
            }
            stack.push(prices[i]);
//            min = Math.min(min, prices[i]);
        }
        if (!stack.empty()) {
            res += stack.pop() - min;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 6, 10}));
//        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 1}));
    }
}
