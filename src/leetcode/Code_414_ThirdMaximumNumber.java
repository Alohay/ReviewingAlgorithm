package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Code_414_ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
//        if (nums == null || nums.length ==0) return
        if (nums.length == 1) return nums[0];
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> {
            long d = o2 - o1;
            if (d > 0) {
                return 1;
            } else if (d < 0) {
                return -1;
            } else {
                return 0;
            }
        });
        for (int i : nums) {
            heap.add(i);
        }
        int i = 0;
        int pre;
        int max = heap.peek();
        while (i < 2 && !heap.isEmpty()) {
            i++;
            pre = heap.poll();
            while (!heap.isEmpty() && heap.peek() == pre) {
                heap.poll();
            }
        }
        if (i == 2 && !heap.isEmpty()) return heap.poll();
        return max;
    }

    public static void main(String[] args) {
        // TODO 为什么 会出错
//        long d = 2147483648;
//        System.out.println(-2147482648 - 1);
        System.out.println(thirdMax(new int[]{-2147483648,1,1}));
    }
}
