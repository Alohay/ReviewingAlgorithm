package leetcode;

import java.util.Arrays;

public class Code_350_IntersectionOfTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int size1 = nums1.length;
        int size2 = nums2.length;
        int i = 0;
        int j = 0;
        int[] res = new int[size1 < size2 ? size1 : size2];
        int n = 0;
        while (i < size1 && j < size2) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                res[n++] = nums1[i];
                i++;
                j++;
            }
        }
        int[] arr = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = res[k];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println('1'&'2');
    }
}
