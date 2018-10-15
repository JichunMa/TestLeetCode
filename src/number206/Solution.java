package number206;

import number002.ListNode;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode list1_1 = new ListNode(1);
        ListNode list1_2 = new ListNode(2);
        ListNode list1_3 = new ListNode(3);
        ListNode list1_4 = new ListNode(4);
        ListNode list1_5 = new ListNode(5);
        list1_1.next = list1_2;
        list1_2.next = list1_3;
        list1_3.next = list1_4;
        list1_4.next = list1_5;
        ListNode node = solution.reverseList2(list1_1);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    //笨办法速度慢
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        ListNode result = stack.pop();
        ListNode current = result;
        while (!stack.empty()) {
            ListNode tmp = stack.pop();
            current.next = tmp;
            current = tmp;
        }
        current.next = null;
        return result;
    }

    //递归实现 速度快
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preHead = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return preHead;
    }


}
