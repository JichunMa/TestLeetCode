package number098;

import java.util.ArrayList;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return true;
        }
        readFromNode(list, root);
        return checkArrayOrder(list);
    }

    private void readFromNode(ArrayList<Integer> list, TreeNode root) {
        if (root != null) {
            readFromNode(list, root.left);
            list.add(root.val);
            readFromNode(list, root.right);
        }

    }

    private boolean checkArrayOrder(ArrayList<Integer> list) {
        if (list.size() == 0) {
            return true;
        }
        int last = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= last) {
                return false;
            }
            last = list.get(i);
        }
        return true;
    }
}
