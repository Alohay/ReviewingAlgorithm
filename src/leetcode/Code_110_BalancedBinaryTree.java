package leetcode;

public class Code_110_BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (compare(root.left, root.right)){
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

    public static boolean compare(TreeNode left, TreeNode right){
        return Math.abs(depth(left) - depth(right)) <= 1;
    }

    public static int depth(TreeNode t) {
        if (t == null) {
            return 0;
        }
        return 1 + Math.max(depth(t.left), depth(t.right));
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
//        t.left.left = new TreeNode(3);
//        t.left.left.left = new TreeNode(4);
//        t.right = new TreeNode(2);
//        t.right.right = new TreeNode(3);
//        t.right.right.right = new TreeNode(4);
        System.out.println(isBalanced(t));
    }
}