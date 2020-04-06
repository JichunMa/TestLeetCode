import number098.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {

        TreeNode nodeRoot1 = new TreeNode(1);
        TreeNode nodeRoot1_1 = new TreeNode(2);
        TreeNode nodeRoot1_2 = new TreeNode(3);
        nodeRoot1.left = nodeRoot1_1;
        nodeRoot1.right = nodeRoot1_2;

        TreeNode nodeRoot2 = new TreeNode(2);
        TreeNode nodeRoot2_2 = new TreeNode(3);
        nodeRoot2.left = nodeRoot2_2;
        System.out.println(isSubtree(nodeRoot1, nodeRoot2));


    }


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

