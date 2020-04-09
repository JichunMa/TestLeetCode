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
        //计算的是当前路径长度和最长的路径长度对比 所以不需要+1
        max = Math.max(max, left + right);
        //计算的是当前节点的最大深度 所以自身也算一层 所以需要+1
        return Math.max(left, right) + 1;
    }
}
