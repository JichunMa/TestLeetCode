import number098.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2_1 = new TreeNode(2);
        TreeNode treeNode2_2 = new TreeNode(7);
        TreeNode treeNode3_1 = new TreeNode(1);
        TreeNode treeNode3_2 = new TreeNode(3);
        TreeNode treeNode3_3 = new TreeNode(6);
        TreeNode treeNode3_4 = new TreeNode(9);
        treeNode1.left = treeNode2_1;
        treeNode1.right = treeNode2_2;
        treeNode2_1.left = treeNode3_1;
        treeNode2_1.right = treeNode3_2;
        treeNode2_2.left = treeNode3_3;
        treeNode2_2.right = treeNode3_4;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        ArrayList<Integer> list = printFromTopToBottom(treeNode1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static ArrayList<Integer> printFromTopToBottom(TreeNode root) {

        ArrayList<Integer> list = new ArrayList();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            list.add(treeNode.val);
            if (treeNode.left != null)
                queue.offer(treeNode.left);
            if (treeNode.right != null)
                queue.offer(treeNode.right);
        }

        return list;
    }


}

