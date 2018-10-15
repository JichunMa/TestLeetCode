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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        ListNode headL1;
        ListNode headL2;
        headL1 = l1;
        headL2 = l2;
        while (headL1 != null && headL2 != null) {
            if (headL1.val < headL2.val) {
                ListNode newNode = new ListNode(headL1.val);
                if (null == head) {
                    head = newNode;
                    current = head;
                } else {
                    current.next = newNode;
                    current = newNode;
                }
                headL1 = headL1.next;
            } else {
                ListNode newNode = new ListNode(headL2.val);
                if (null == head) {
                    head = newNode;
                    current = head;
                } else {
                    current.next = newNode;
                    current = newNode;
                }
                headL2 = headL2.next;
            }
        }

        while (headL1 != null) {
            ListNode newNode = new ListNode(headL1.val);
            if (null == head) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = newNode;
            }
            headL1 = headL1.next;
        }
        while (headL2 != null) {
            ListNode newNode = new ListNode(headL2.val);
            if (null == head) {
                head = newNode;
                current = head;
            } else {
                current.next = newNode;
                current = newNode;
            }
            headL2 = headL2.next;
        }
        return head;
    }

}
