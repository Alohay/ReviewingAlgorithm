package leetcode;

public class Code_198_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null) return 0;
        int size = nums.length;
        if (size < 1) return 0;
        int[] pass = new int[size];
        int[] rob = new int[size];
        pass[0] = 0;
        rob[0] = nums[0];
        for (int i = 1; i < size; i++) {
            pass[i] = Math.max(pass[i - 1], rob[i - 1]);
            rob[i] = pass[i - 1] + nums[i];
        }
        return Math.max(pass[size - 1], rob[size - 1]);
    }

    public int rob1(int[] nums) {
        if (nums == null) return 0;
        int size = nums.length;
        if (size < 1) return 0;
        if (size < 2) return nums[0];
        int g1 = nums[0];
        int g2 = Math.max(nums[0], nums[1]);
        int g = 0;
        for (int i = 2; i < size; i++) {
            g = Math.max(g1 + nums[i], g2);
            g1 = g2;
            g2 = g;
        }
        return g;
    }
}
