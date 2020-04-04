package number098;

import java.util.ArrayList;
import java.util.List;

/**
 * 利用二叉搜索树的中序遍历是一个递增序列
 */
public class Solution {

    public boolean isValidBST(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        readFromNode(list, root);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).val >= list.get(i + 1).val) {
                return false;
            }
        }
        return true;
    }

    public void readFromNode(List<TreeNode> list, TreeNode node) {
        if (node != null) {
            readFromNode(list, node.left);
            list.add(node);
            readFromNode(list, node.right);
        }
    }
}
