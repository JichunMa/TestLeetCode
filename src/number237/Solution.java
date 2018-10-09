package number237;

import number002.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
