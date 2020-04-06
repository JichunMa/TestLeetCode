package number226;

import number098.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);


        TreeNode tmp;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }
}
