package leetcode;

public class Code_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compare(root.left, root.right);
    }

    public boolean compare(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return compare(t1.left, t2.right) && compare(t1.right, t2.left);
    }
}