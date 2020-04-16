package number739;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        if (T.length <= 1) {
            return T;
        }
        Stack<Integer> stack = new Stack();
        stack.add(0);
        int stackTopIndex;
        for (int i = 1; i < T.length; i++) {
            while (!stack.isEmpty()) {
                stackTopIndex = stack.peek();
                if (T[stackTopIndex] < T[i]) {
                    stack.pop();
                    result[stackTopIndex] = i - stackTopIndex;
                } else {
                    break;
                }
            }
            stack.push(i);
        }
        return result;
    }

}
