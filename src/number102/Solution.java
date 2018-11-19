package number102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> res = solution.levelOrder(root);

        for (List<Integer> is : res) {
            for (Integer i : is) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> resultList = new ArrayList();
        if (root == null) {
            return resultList;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.add(root);
        TreeNode node;

        while (!linkedList.isEmpty()) {
            ArrayList<Integer> listInner = new ArrayList<>();
            int length = linkedList.size();
            for (int i = 0; i < length; i++) {
                node = linkedList.pop();
                listInner.add(node.val);
                if (node.left != null) {
                    linkedList.add(node.left);
                }
                if (node.right != null) {
                    linkedList.add(node.right);
                }
            }
            resultList.add(listInner);
        }
        return resultList;
    }


}
