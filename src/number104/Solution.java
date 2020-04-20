package number104;

import number098.TreeNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
