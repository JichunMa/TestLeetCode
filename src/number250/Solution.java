package number250;

import number098.TreeNode;

public class Solution {

    int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return count;
    }

    public boolean helper(TreeNode root) {
        if (root.left == null && root.right == null) {
            count++;
            return true;
        }
        boolean isSame = true;
        if (root.left != null) {
            isSame &= helper(root.left);
            isSame &= root.val == root.left.val;
        }
        if (root.right != null) {
            isSame &= helper(root.right);
            isSame &= root.val == root.right.val;
        }
        if (isSame) {
            count++;
        }
        return isSame;
    }


}
