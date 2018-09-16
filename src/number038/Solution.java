package number038;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.countAndSay(2);
        System.out.println(result);
    }


    public String countAndSay(int n) {
        HashMap<Integer, StringBuilder> map = buildMap();
        return map.get(n).toString();
    }

    public HashMap<Integer, StringBuilder> buildMap() {
        HashMap<Integer, StringBuilder> map = new HashMap<>();
        StringBuilder currentStr = new StringBuilder("1");
        for (int i = 1; i < 31; i++) {
            map.put(i, currentStr);
            currentStr = sayCount(currentStr);
        }
        return map;
    }

    public StringBuilder sayCount(StringBuilder source) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = source.toString().toCharArray();
        char lastChar = ' ';
        int repeatCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (lastChar == ' ') {
                lastChar = chars[i];
                repeatCount++;
            } else {
                if (lastChar == chars[i]) {
                    repeatCount++;
                } else {
                    stringBuilder.append(repeatCount).append(lastChar);
                    lastChar = chars[i];
                    repeatCount = 1;
                }
            }
        }
        if (lastChar != ' ') {
            stringBuilder.append(repeatCount).append(lastChar);
        }
        return stringBuilder;
    }


}
