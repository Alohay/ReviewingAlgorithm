package leetcode;

public class Code_198_HouseRobber {
    public int rob(int[] nums) {
        if (nums == null) return 0;
        return process(nums, 0, 0);
    }

    public int process(int[] nums, int res, int i) {
        if (i >= nums.length) {
            return res;
        }
        return Math.max(process(nums, res + nums[i], i + 2),
                process(nums, res, i + 1)
        );
    }

// TODO 重写 改写 dp

//    public int dp(int[] nums) {
//        int size = nums.length;
//        int[] robed = new int[size];
//        int[] pass = new int[size];
//        robed[0] = nums[0];
//        pass[0] = 0;
//        for (int i = 1; i < size; i++) {
//            robed[i] = nums[i] + pass[i - 1];
//            pass[i] = Math.max(pass[i - 1], robed[i - 1]);
//        }
//        return Math.max(robed[size - 1], pass[size - 1]);
//    }
}
