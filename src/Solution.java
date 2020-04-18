import number002.ListNode;
import sun.nio.cs.ArrayEncoder;

import java.util.Arrays;
import java.util.Stack;


public class Solution {


    public static void main(String[] args) {
    }


    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        if (s.trim().length() == 0) {
            return 0;
        }
        if (s.indexOf(" ") == -1 || s.indexOf(" ") == s.length() - 1) {
            return 0;
        }

        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();

    }


}
