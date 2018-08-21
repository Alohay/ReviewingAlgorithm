package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Code_107_BinaryTreeLevelOrderTraversalII {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = queue.poll();
                if (tmp != null) {
                    list.add(tmp.val);
                    queue.add(tmp.left);
                    queue.add(tmp.right);
                }
            }
            if (list.size() > 0)
                lists.add(0, list);
        }
        return lists;
    }

}
