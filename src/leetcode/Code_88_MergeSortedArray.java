package leetcode;

public class Code_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n;
        n -= 1;
        m -= 1;
        for (int i = size - 1; i >= 0 && n >= 0 && m >= 0; i--) {
            nums1[i] = nums2[n] < nums1[m] ? nums1[m--] : nums2[n--];
        }
        while (n >= 0) {
            nums1[n] = nums2[n--];
        }
        while (m >= 0) {
            nums1[m] = nums1[m--];
        }
    }
}
