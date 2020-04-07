package number543;

import number098.TreeNode;

public class Solution {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return max;
    }
    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
}
