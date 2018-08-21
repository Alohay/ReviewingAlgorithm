package leetcode;

public class Code_112_PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return process(root, 0, sum);
    }

    public static boolean process(TreeNode root, int res, int sum) {
        if (root == null) {
            return res == sum;
        }
        if (root.left == null) {
            return process(root.right, res + root.val, sum);
        }
        if (root.right == null) {
            return process(root.left, res + root.val, sum);
        }
        return process(root.left, res + root.val, sum) || process(root.right, res + root.val, sum);
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(-2);
        t.right = new TreeNode(-2);
        System.out.println(hasPathSum(t, -4));
    }
}
