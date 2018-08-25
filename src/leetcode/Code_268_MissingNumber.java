package leetcode;

public class Code_268_MissingNumber {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size + 1];
        for (int i = 0; i < size; i++) {
            if (nums[i] <= size) arr[nums[i]] = 1;
        }
        for (int i = 0; i < size + 1; i++) {
            if (arr[i] == 0) return i;
        }
        return 0;
    }
}
