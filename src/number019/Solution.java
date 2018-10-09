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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode node = head;
        ListNode lastNode = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        int minus = length - n;
        node = head;
        for (int i = 1; i < minus + 1; i++) {
            lastNode = node;
            node = node.next;
        }
        ListNode nextNode = node.next;
        if (nextNode != null) {
            node.val = nextNode.val;
            node.next = nextNode.next;
        } else {
            if (length == 1) {
                return null;
            } else {
                lastNode.next = null;
            }
        }
        return head;
    }
}
