package number110;

import number098.TreeNode;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = getMaxDepth(root.left);
        int right = getMaxDepth(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        } else {
            return (isBalanced(root.left) && isBalanced(root.right));
        }
    }

    public int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getMaxDepth(root.left);
        int right = getMaxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
