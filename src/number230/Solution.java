package number230;

import number098.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        preOrderVisit(list, root);
        return list.get(k - 1);
    }

    public void preOrderVisit(List<Integer> list, TreeNode root) {
        if (root == null) {
            return;
        }
        preOrderVisit(list, root.left);
        list.add(root.val);
        preOrderVisit(list, root.right);
    }
}
