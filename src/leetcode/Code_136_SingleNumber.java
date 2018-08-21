package leetcode;

public class Code_136_SingleNumber {
    public static int singleNumber(int[] nums) {
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
        for (int i = 1; i < size; i++) {
            if (nums[i] == nums[i - 1]) {
                i++;
            } else {
                return nums[i - 1];
            }
        }
        return nums[size - 1];
    }

    public static void swap(int[] arr, int p, int q) {
        arr[p] += arr[q];
        arr[q] = arr[p] - arr[q];
        arr[p] = arr[p] - arr[q];
    }

    public static void main(String[] args) {
        System.out.println(  singleNumber(new int[]{2, 2, 3}));
    }
}
