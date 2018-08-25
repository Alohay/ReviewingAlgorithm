package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Code_349_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums2) {
            if (set1.contains(i)) set.add(i);
        }

        int[] res = new int[set.size()];
        int j = 0;
        for (Integer i : set) {
            res[j++] = i;
        }
        return res;
    }


}
