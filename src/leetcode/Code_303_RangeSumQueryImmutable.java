package leetcode;

public class Code_303_RangeSumQueryImmutable {
    class NumArray {
        private int[] arr;

        public NumArray(int[] nums) {
            arr = nums;
            int size = nums.length;
            for (int i = 1; i < size; i++) {
                arr[i] += arr[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            return arr[j] - (i == 0 ? 0 : arr[i - 1]);
        }
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
}
