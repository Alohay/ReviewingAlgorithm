package leetcode;

public class Code_100_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return printTree(p).toString().equals(printTree(q).toString());
    }

    public StringBuilder printTree(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        if (t == null) {
            sb.append("N").append('#');
            return sb;
        }
        sb.append(t.val).append('#').append(printTree(t.left)).append(printTree(t.right));
        return sb;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
