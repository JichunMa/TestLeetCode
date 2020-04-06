package number199;

import number098.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getRight(root, 0, list);
        return list;
    }

    public void getRight(TreeNode node, int depth, List<Integer> list) {
        if (node == null) {
            return;
        }
        if (list.size() == depth) {
            list.add(node.val);
        }
        getRight(node.right, depth + 1, list);
        getRight(node.left, depth + 1, list);
    }
}
