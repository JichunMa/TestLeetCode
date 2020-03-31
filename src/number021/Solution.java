package number021;

import number002.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(4);
//        ListNode list1_4 = new ListNode(4);
//        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_2;
        list1_2.next = list1_3;
//        list1_3.next = list1_4;
//        list1_4.next = list1_5;

        ListNode list2_1 = new ListNode(1);
        ListNode list2_2 = new ListNode(3);
        ListNode list2_3 = new ListNode(4);
//        ListNode list2_4 = new ListNode(4);
        list2_1.next = list2_2;
        list2_2.next = list2_3;
//        list2_3.next = list2_4;
//        list2_4.next = list1_5;
        ListNode head = solution.mergeTwoLists(list1_1, list2_1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode lastNode = null;
        ListNode newNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                newNode = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                newNode = new ListNode(l2.val);
                l2 = l2.next;
            }

            if (head == null) {
                head = newNode;
                lastNode = newNode;
            } else {
                lastNode.next = newNode;
                lastNode = newNode;
            }
        }

        while (l1 != null) {
            newNode = new ListNode(l1.val);
            lastNode.next = newNode;
            lastNode = newNode;
            l1 = l1.next;
        }

        while (l2 != null) {
            newNode = new ListNode(l2.val);
            lastNode.next = newNode;
            lastNode = newNode;
            l2 = l2.next;
        }
        return head;
    }

}
