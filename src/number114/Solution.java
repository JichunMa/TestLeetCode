package number114;

import number098.TreeNode;

public class Solution {

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        getTree(root);
    }

    public static TreeNode getTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode left = getTree(root.left);
        TreeNode right = getTree(root.right);
        root.left = null;
        if (left != null) {
            root.right = left;
            getTailNode(left).right = right;
        } else {
            root.right = right;
        }
        return root;
    }

    public static TreeNode getTailNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode lastNode = null;
        while (root != null) {
            lastNode = root;
            root = root.right;
        }
        return lastNode;

    }
}
