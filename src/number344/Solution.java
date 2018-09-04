package number344;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.reverseString("hello");
        System.out.println(result);
    }

    public String reverseString(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
