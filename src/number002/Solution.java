package number002;

import java.util.ArrayList;


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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean addFlag = false;//进位标示
        int sum = 0;
        int singleDigitResult = 0;
        ArrayList<Integer> resultList = new ArrayList<>();

        if (isAllZero(l1) && isAllZero(l2)) {
            resultList.add(0);
        } else if (isAllZero(l1)) {
            ListNode node = l2;
            while (node != null && node.val != 0) {
                resultList.add(node.val);
                node = node.next;
            }
        } else if (isAllZero(l2)) {
            ListNode node = l1;
            while (node != null && node.val != 0) {
                resultList.add(node.val);
                node = node.next;
            }
        } else {
            ArrayList<Integer> arrayList1 = new ArrayList<>();
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            int lengthList1 = getListLength(l1);
            int lengthList2 = getListLength(l2);
            int minusValue = lengthList1 - lengthList2;
            if (minusValue != 0) {
                if (minusValue > 0) {
                    for (int i = minusValue; i > 0; i--) {
                        ListNode node = new ListNode(0);
                        getRealNode(l2).next = node;
                    }
                } else {
                    for (int i = minusValue; i < 0; i++) {
                        ListNode node = new ListNode(0);
                        getRealNode(l1).next = node;
                    }
                }
            }
            ListNode currentNode = l1;
            while (currentNode != null) {
                arrayList1.add(currentNode.val);
                currentNode = currentNode.next;
            }
            currentNode = l2;
            while (currentNode != null) {
                arrayList2.add(currentNode.val);
                currentNode = currentNode.next;
            }

            int length = arrayList1.size();
            int index = 0;
            while (index < length) {
                Integer arg1 = arrayList1.get(index);
                Integer arg2 = arrayList2.get(index);
                sum = arg1 + arg2;
                if (addFlag) {
                    //处理进位
                    sum = sum + 1;
                    addFlag = false;
                }
                if (sum / 10 > 0) {
                    addFlag = true;
                    singleDigitResult = sum % 10;
                } else {
                    singleDigitResult = sum;
                }
                resultList.add(singleDigitResult);
                index++;
            }
            if (addFlag) {
                resultList.add(1);
            }
        }
        ListNode head = null;
        ListNode lastNode = null;
        for (int data : resultList) {
            ListNode node = new ListNode(data);
            if (head == null) {
                head = node;
            } else {
                lastNode.next = node;
            }
            lastNode = node;
        }
        return head;
    }
    boolean isAllZero(ListNode listNode) {
        ListNode node = listNode;
        boolean isAllZero = true;
        while (node != null) {
            if (node.val != 0) {
                isAllZero = false;
                return isAllZero;
            }
            node = node.next;
        }
        return isAllZero;
    }

    int getListLength(ListNode listNode) {
        int length = 0;
        ListNode node = listNode;
        while (node != null) {
            length = length + 1;
            node = node.next;
        }
        return length;
    }

    ListNode getRealNode(ListNode listNode) {
        ListNode node = listNode;
        ListNode lastNode = listNode;
        while (node != null) {
            lastNode = node;
            node = node.next;
        }
        return lastNode;
    }
}
