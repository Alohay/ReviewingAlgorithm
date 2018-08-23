package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Code_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        Set<Integer> set = new HashSet<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (!set.add(nums[i])) return true;
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(nums[i] > nums[j])
                {
                    break;
                }
                else if(nums[i] == nums[j])
                {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate1(new int[]{1,7,5,7}));
    }

}
