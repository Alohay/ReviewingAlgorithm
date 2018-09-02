package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Code_448_FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[nums[i] % (n + 1) - 1] += n + 1;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] / (n + 1) == 0) res.add(i + 1);
        }
        return res;
    }
}
