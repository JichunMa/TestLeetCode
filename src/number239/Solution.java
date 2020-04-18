package number239;

import java.util.Iterator;
import java.util.LinkedList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] source = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] res = solution.maxSlidingWindow(source, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[0];
        }
        LinkedList<Integer> linkedList = new LinkedList();
        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty() && nums[linkedList.peekLast()] < nums[i]) {
                linkedList.removeLast();
            }
            linkedList.addLast(i);

            // 维持队列中的数量 将超出窗口长度的头部删除
            if (i - k == linkedList.getFirst()) {
                linkedList.removeFirst();
            }

            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[linkedList.getFirst()];
            }
        }

        return result;
    }
}
