package leetcode;

public class Code_283_MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int index = 0;
        int i = 0;
        while (i < size) {
            if (nums[i] != 0) nums[index++] = nums[i++];
            else i++;
        }
        while (index < size) {
            nums[index++] = 0;
        }
    }

    public static void swap(int[] arr, int p, int q) {
        arr[p] += arr[q];
        arr[q] = arr[p] - arr[q];
        arr[p] = arr[p] - arr[q];
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
