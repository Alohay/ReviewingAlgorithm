package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Code_219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            Integer oldIndex = map.put(nums[i], i);
            if (oldIndex != null && i - oldIndex <= k) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        int flag = 0;
        for(int i =1; i < nums.length; i++) {
            //确定前面肯定没有重复情况下
            //每次拿当前的和前面的对比,当前>前面就跳出, == 就是返回
            for(int j = i-1; j>= 0; j --) {
                if(nums[i] > nums[j]) {
                    break;
                }else if(nums[i] == nums[j]) {
                    if (i - j <= k)
                        flag = 1;
                }
            }
        }
        if(flag == 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate1(new int[]{1,7,5,7},2));
    }
}
