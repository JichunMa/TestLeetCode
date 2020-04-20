package number112;

import number098.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        int target = sum - root.val;
        return hasPathSum(root.left, target) || hasPathSum(root.right, target);
    }
}
