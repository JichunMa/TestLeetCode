package number101;


import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        root.left.right.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);
        root.right.left.left = new TreeNode(9);
        root.right.left.right = new TreeNode(8);
        boolean result = solution.isSymmetric(root);
        System.out.println(result);

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        ArrayList<Integer> listLeft = new ArrayList<>();
        positionSequenceRead(listLeft, root.left);
        ArrayList<Integer> listRight = new ArrayList<>();
        negativeSequenceRead(listRight, root.right);
        return checkTwoArrayIsSame(listLeft, listRight);
    }

    public boolean checkTwoArrayIsSame(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    //根左右的读取数据(左子树的读法)
    public ArrayList<Integer> positionSequenceRead(ArrayList<Integer> list, TreeNode leftRoot) {
        if (leftRoot == null) {
            list.add(null);
        } else {
            list.add(leftRoot.val);
            if (leftRoot.left != null || leftRoot.right != null) {
                positionSequenceRead(list, leftRoot.left);
                positionSequenceRead(list, leftRoot.right);
            }
        }
        return list;
    }

    //根右左的读取数据(右子树的读法)
    public ArrayList<Integer> negativeSequenceRead(ArrayList<Integer> list, TreeNode rightRoot) {
        if (rightRoot == null) {
            list.add(null);
        } else {
            list.add(rightRoot.val);
            if (rightRoot.left != null || rightRoot.right != null) {
                negativeSequenceRead(list, rightRoot.right);
                negativeSequenceRead(list, rightRoot.left);
            }
        }
        return list;
    }


}
