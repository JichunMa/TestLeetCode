package number124;

import number098.TreeNode;

/**
 * 外界记录一个当前最大值 然后比较max与该节点最大值（节点自己或节点加孩子节点） 决定是否要该节点
 */
public class Solution {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSum2(root);
        return max;
    }

    public int maxPathSum2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int rootVal = root.val;
        int leftSum = maxPathSum2(root.left);
        int rightSum = maxPathSum2(root.right);

        if (leftSum < 0) {
            leftSum = 0;
        }
        if (rightSum < 0) {
            rightSum = 0;
        }
        if (rootVal + leftSum + rightSum > max) {
            max = rootVal + leftSum + rightSum;
        }
        return rootVal + (leftSum > rightSum ? leftSum : rightSum);
    }


}
