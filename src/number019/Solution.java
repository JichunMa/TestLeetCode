package number019;

import number002.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1_1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(3);
        ListNode list1_4 = new ListNode(4);
        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_2;
//        list1_2.next = list1_3;
//        list1_3.next = list1_4;
//        list1_4.next = list1_5;
        ListNode node = solution.removeNthFromEnd(list1_1, 1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public  ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode quick = dummy;

        for (int i = 0; i < n; i++) {
            quick = quick.next;
        }

        while (quick.next != null) {
            slow = slow.next;
            quick = quick.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
