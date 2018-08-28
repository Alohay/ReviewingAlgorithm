package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Code_404_SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur.left != null) {
                queue.add(cur.left);
                if (cur.left.left == null && cur.left.right == null)
                    res += cur.left.val;
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return res;
    }
}
