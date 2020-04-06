package number572;

import number098.TreeNode;

/**
 * 比较两个树的先序遍历结果
 * tips1: 每个节点输出值前要加分割符合# 避免23 和2、3 匹配成功
 */
public class Solution {

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        String order1 = preOrder(s, true);
        String order2 = preOrder(t, true);
        return order1.contains(order2);
    }

    public static String preOrder(TreeNode node, boolean isLeft) {
        if (node == null) {
            if (isLeft) {
                return "lnull";
            } else {
                return "rnull";
            }
        }
        return "#" + node.val + preOrder(node.left, true) + preOrder(node.right, false);
    }
}
