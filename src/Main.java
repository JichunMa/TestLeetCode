import number098.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }


    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);


        TreeNode tmp;
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        return root;
    }

}

