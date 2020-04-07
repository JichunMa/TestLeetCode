package number236;

import number098.TreeNode;

/**
 * 按层向下递归查找 找到中一个就返回哪个给上级 某一级判断找到两个时就返回自己
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);
        if (leftNode != null && rightNode != null) {
            return root;
        }
        return leftNode != null ? leftNode : rightNode;
    }
}
