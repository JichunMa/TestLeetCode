package number141;

import number002.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1_1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(2);
        ListNode list1_4 = new ListNode(1);
        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_2;
//        list1_2.next = list1_3;
//        list1_3.next = list1_4;
//        list1_4.next = list1_5;
        boolean result = solution.hasCycle(list1_1);
        System.out.println(result);
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
            if (l1 == l2) {
                return true;
            }
        }
        return false;
    }
}
