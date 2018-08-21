package leetcode;

import java.util.Arrays;

public class Code_35_SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int r = Arrays.binarySearch(nums, target);
        return r >= 0 ? r : -r - 1;
    }

    public static int search(int[] nums, int t) {
        int size = nums.length;
        int l = 0;
        int r = size - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < t) {
                l = m + 1;
            } else if (nums[m] > t) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6};
        System.out.println(search(arr, 4));
        System.out.println(searchInsert(arr, 4));
    }
}
