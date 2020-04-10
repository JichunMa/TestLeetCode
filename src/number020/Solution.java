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
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (getType(ch) < 0) {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char charStackTop = stack.pop();
                if (getType(ch) + getType(charStackTop) == 0) {
                    //匹配则继续
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.empty();

    }

    public int getType(char ch) {
        if (ch == '(') {
            return -1;
        } else if (ch == ')') {
            return 1;
        } else if (ch == '[') {
            return -2;
        } else if (ch == ']') {
            return 2;
        } else if (ch == '{') {
            return -3;
        } else {
            return 3;
        }
    }


}
