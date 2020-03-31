package number002;



public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_0 = new ListNode(1);
        ListNode list1_1 = new ListNode(0);
        ListNode list1_2 = new ListNode(9);
        list1_0.next = list1_1;
        list1_1.next = list1_2;
        ListNode list1 = list1_0;

        ListNode list2_0 = new ListNode(5);
        ListNode list2_1 = new ListNode(7);
        ListNode list2_2 = new ListNode(8);
        list2_0.next = list2_1;
        list2_1.next = list2_2;
        ListNode list2 = list2_0;

        ListNode head = solution.addTwoNumbers(list1, list2);
        while (head != null) {
            System.out.println("result : " + head.val);
            head = head.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        boolean isCarry = false;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode head = null;
        ListNode currentNode = null;
        while (node1 != null || node2 != null) {
            int value1 = node1 != null ? node1.val : 0;
            int value2 = node2 != null ? node2.val : 0;
            int tmp = value1 + value2;
            if (isCarry) {
                tmp++;
                isCarry = false;
            }
            int value = tmp;
            if (tmp >= 10) {
                value = tmp % 10;
                isCarry = true;
            }
            if (currentNode == null) {
                currentNode = new ListNode(value);
                head = currentNode;
            } else {
                ListNode tmpNode = new ListNode(value);
                currentNode.next = tmpNode;
                currentNode = tmpNode;
            }
            if (node1 != null) {
                node1 = node1.next;
            }

            if (node2 != null) {
                node2 = node2.next;
            }

        }

        if (isCarry) {
            currentNode.next = new ListNode(1);
        }
        return head;
    }
}
