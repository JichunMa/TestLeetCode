package number083;

import number002.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode node = head.next;
        while (node != null) {
            if (pre.val != node.val) {
                pre.next = node;
                pre = node;
            }
            node = node.next;
        }
        return head;
    }
}
