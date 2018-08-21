package leetcode;

public class Code_53_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int size = nums.length;
        int max = nums[size - 1];
        int val = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            val = val < 0 ? nums[i] : val + nums[i];
            max = Math.max(val, max);
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{31, -41, 59, 26, -53, 58, 97, -93, -23, 84};
        int[] arr = new int[]{-2, -4};

        System.out.println(maxSubArray(arr));
    }

}
