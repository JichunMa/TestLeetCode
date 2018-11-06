package number020;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String source = "()";
        String source1 = "()[]{}";
        String source2 = "([)]";
        String source3 = "(]";
        String source4 = "{[]}";
        String source5 = "}";
        System.out.println(solution.isValid(source5));
    }


    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int topValue;

        for (int i = 0; i < chars.length; i++) {
            int value = judgeBrackets(chars[i]);
            if (value > 0) {
                stack.push(value);
            } else {
                //只有右括号
                if (stack.empty()) {
                    return false;
                }
                topValue = stack.pop();
                if (value + topValue == 0) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    private int judgeBrackets(char ch) {
        if (ch == '(') {
            return 1;
        } else if (ch == '[') {
            return 2;
        } else if (ch == '{') {
            return 3;
        } else if (ch == ')') {
            return -1;
        } else if (ch == ']') {
            return -2;
        } else if (ch == '}') {
            return -3;
        } else {
            return 0;
        }
    }


}
