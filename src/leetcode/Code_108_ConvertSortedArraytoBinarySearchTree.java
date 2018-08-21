package leetcode;

public class Code_108_ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return process(nums, 0, nums.length - 1);
    }

    public TreeNode process(int[] nums, int l, int r) {
        if (l > r) {
            return null;
        }
        int m = l + (r - l) / 2;
        TreeNode cur = new TreeNode(nums[m]);
        cur.left = process(nums, l, m - 1);
        cur.right = process(nums, m + 1, r);
        return cur;
    }
}
