package leetcode;

import java.util.Stack;

public class Code_104_MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return 0;
        }
        int depth = 1;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            int tmp = depth;
            if (cur.left != null) {
                stack.push(cur);
                stack.push(cur.left);

            } else if (cur.right != null) {
                stack.push(cur);
                stack.push(cur.right);
            } else {
                depth++;
            }
        }
        return depth;
    }


    public int process(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(process(root.left), process(root.right));
    }

}
