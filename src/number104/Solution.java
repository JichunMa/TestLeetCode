package number104;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        if (depthLeft > depthRight) {
            depth = depthLeft + 1;
        } else {
            depth = depthRight + 1;
        }
        return depth;
    }
}
