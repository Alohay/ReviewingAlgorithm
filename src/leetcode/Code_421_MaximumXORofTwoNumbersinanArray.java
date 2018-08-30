package leetcode;

public class Code_421_MaximumXORofTwoNumbersinanArray {
    public static int findMaximumXOR(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int res = 0;
        for (int i = 0; i < size; i++) {
            res = Math.max(res, max ^ nums[i]);
            res = Math.max(res, min ^ nums[i]);
        }
        return res;
//
//        int i = 1;
//        while (max / i != 0) {
//            i <<= 1;
//        }
//        i >>= 1;
//        int n = max;
//        while (n >= i) {
//            n -= i;
//            i >>= 1;
//        }
//        i <<= 1;
//        int m = i - 1;
//        int d = m;
//        for (int j = 1; j < size; j++) {
//            int cur = m - nums[j];
//            d = (cur >= 0 && cur < d) ? nums[j] : d;
//        }
//        return max ^ d;
    }

    public static void main(String[] args) {
        System.out.println(findMaximumXOR(new int[]{0}));
    }
}
