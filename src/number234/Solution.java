package number234;

import number002.ListNode;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1_1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(2);
        ListNode list1_4 = new ListNode(1);
        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_2;
        list1_2.next = list1_3;
        list1_3.next = list1_4;
//        list1_4.next = list1_5;
        System.out.println(solution.isPalindrome(list1_1));
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            arrayList.add(current);
            current = current.next;
        }
        int length = arrayList.size();
        for (int i = 0; i < length / 2; i++) {
            if (arrayList.get(i).val != arrayList.get(length - 1 - i).val) {
                return false;
            }
        }
        return true;
    }
}
