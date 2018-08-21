package leetcode;

import java.util.Stack;

public class Code_121_BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        int days = prices.length;
        int d = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < days; i++) {
            while (!stack.empty() && stack.peek() >= prices[i]) {
                Integer pop = stack.pop();
                d = Math.max(d, pop - min);
            }
            stack.push(prices[i]);
            min = Math.min(min, prices[i]);
        }
        if (!stack.empty()) {
            d = Math.max(d, stack.pop() - min);
        }
        return d;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 6, 10}));
    }
}
