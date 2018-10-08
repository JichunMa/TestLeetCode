package number013;

import java.util.LinkedList;
import java.util.Queue;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String source = "DCXXI";
        int result = solution.romanToInt(source);
        System.out.println(result);
    }

    public int romanToInt(String s) {
        Queue<Character> queue = new LinkedList();
        char[] chars = s.toCharArray();
        int result = 0;
        if (s == null || s.equals("")) {
            return 0;
        }
        for (int i = 0; i < chars.length; i++) {
            queue.add(chars[i]);
        }
        while (queue.size() != 0) {
            char ch = queue.poll();
            if (ch == 'I') {
                if (queue.size() != 0) {
                    char chNext = queue.peek();
                    if (chNext == 'V') {
                        queue.poll();
                        result = result + 4;
                    } else if (chNext == 'X') {
                        queue.poll();
                        result = result + 9;
                    } else {
                        result = result + 1;
                    }
                } else {
                    result = result + 1;
                }
            } else if (ch == 'X') {
                if (queue.size() != 0) {
                    char chNext = queue.peek();
                    if (chNext == 'L') {
                        queue.poll();
                        result = result + 40;
                    } else if (chNext == 'C') {
                        queue.poll();
                        result = result + 90;
                    } else {
                        result = result + 10;
                    }
                } else {
                    result = result + 10;
                }
            } else if (ch == 'C') {
                if (queue.size() != 0) {
                    char chNext = queue.peek();
                    if (chNext == 'D') {
                        queue.poll();
                        result = result + 400;
                    } else if (chNext == 'M') {
                        queue.poll();
                        result = result + 900;
                    } else {
                        result = result + 100;
                    }
                } else {
                    result = result + 100;
                }
            } else if (ch == 'V') {
                result = result + 5;
            } else if (ch == 'L') {
                result = result + 50;
            } else if (ch == 'D') {
                result = result + 500;
            } else if (ch == 'M') {
                result = result + 1000;
            }
        }
        return result;
    }
}
