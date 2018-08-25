package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Code_257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return new ArrayList<>();
        return process(root, new StringBuilder());
    }

    public List<String> process(TreeNode root, StringBuilder sb) {
        if (root == null) return null;
        List<String> res = new ArrayList<>();
        if (root.right == null && root.left == null) res.add(String.valueOf(sb) + root.val);
        // what if addAll(null)
        List<String> list = process(root.left, new StringBuilder(sb).append(root.val).append("->"));
        if (list != null) res.addAll(list);
        list = process(root.right, new StringBuilder(sb).append(root.val).append("->"));
        if (list != null) res.addAll(list);
        return res;
    }
}
