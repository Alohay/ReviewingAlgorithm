package leetcode;

import java.util.HashMap;

public class Code_167_TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        // !!! 未使用到输入有序
        HashMap<Integer, Integer> map = new HashMap<>();
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            int rest = target - numbers[i];
            Integer idx = map.get(rest);
            if (idx != null) {
                return i < idx ? new int[]{i + 1, idx + 1} : new int[]{idx + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
