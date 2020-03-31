

import number002.ListNode;


public class Main {

    public static void main(String[] args) {
        ListNode list2_0 = new ListNode(1);
        ListNode list2_1 = new ListNode(2);
        ListNode list2_2 = new ListNode(3);
        list2_0.next = list2_1;
//        list2_1.next = list2_2;
        ListNode list2 = list2_0;

        ListNode head = removeNthFromEnd(list2, 1);
        while (head != null) {
            System.out.println("result : " + head.val);
            head = head.next;
        }
    }


    public static ListNode removeNthFromEnd(ListNode head, int n) {
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
