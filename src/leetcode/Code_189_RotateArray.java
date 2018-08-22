package leetcode;

public class Code_189_RotateArray {
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverse(nums, size - k, size - 1);
        reverse(nums, 0, size - k - 1);
        reverse(nums, 0, size - 1);
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }

    public static void swap(int[] arr, int p, int q) {
        arr[p] += arr[q];
        arr[q] = arr[p] - arr[q];
        arr[p] = arr[p] - arr[q];
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4}, 1);
    }
}
