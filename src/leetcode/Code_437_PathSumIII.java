package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Code_437_PathSumIII {
    public static int pathSum(TreeNode root, int sum) {
        if (root == null) return sum == 0 ? 1 : 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            res += process(cur, 0, sum);
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
        return res;
    }


    public static int process(TreeNode root, int curr, int sum) {
        if (root == null) return 0;
        curr += root.val;
        int res = 0;
        if (curr == sum) res++;

        res += process(root.left, curr, sum) + process(root.right, curr, sum);
        return res;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
//        map.getOrDefault()
        TreeNode r = new TreeNode(10);
        r.right = new TreeNode(-3);
        r.right.right = new TreeNode(11);
        r.left = new TreeNode(5);
        r.left.left = new TreeNode(3);
        r.left.right = new TreeNode(2);
        r.left.right.right = new TreeNode(1);
        r.left.left.left = new TreeNode(3);
        r.left.left.right = new TreeNode(-2);
        System.out.println(pathSum(r, 8));
    }
}
