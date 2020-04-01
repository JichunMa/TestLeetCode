package number3;

import java.util.HashMap;

/**
 * 解题思路
 * 求两个重复的字符之间的字串的最大长度
 */
public class Solution {

    public static void main(String[] args) {
        String source = "abba";
        System.out.println(lengthOfLongestSubstring(source));
    }


    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        int max = 0;
        int pre = -1;//上一个出现重复的索引
        HashMap<Character, Integer> map = new HashMap<>();
        int strLen = s.length();
        for (int i = 0; i < strLen; i++) {
            Character ch = s.charAt(i);
            Integer index = map.get(ch);
            if (index != null) {
                pre = Math.max(pre, index);
            }
            max = Math.max(max, i - pre);
            map.put(ch, i);
        }
        return max;
    }
}
