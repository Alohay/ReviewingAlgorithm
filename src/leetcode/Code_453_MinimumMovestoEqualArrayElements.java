package leetcode;

public class Code_453_MinimumMovestoEqualArrayElements {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int size = nums.length;

        for (int i = 0; i < size; i++) {
            min = Math.min(min, nums[i]);
        }

        int res = 0;
        for (int i = 0; i < size; i++) {
            res += nums[i] - min;
        }
        return res;
    }
}
