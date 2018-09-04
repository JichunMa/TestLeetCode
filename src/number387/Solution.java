package number387;


public class Solution {
    private static final int ACorrespondIndex = 97;

    public static void main(String[] args) {
        Solution solution = new Solution();
        int index = solution.firstUniqChar("loveleetcode");
        System.out.println(index);
    }

    public int firstUniqChar(String s) {
        if (s == null || s.equals("")) {
            return -1;
        }
        char[] chars = s.toCharArray();
        int[] charMap = buildLetterCountChars(s);
        for (int i = 0; i < chars.length; i++) {
            int index = chars[i] - ACorrespondIndex;
            if (charMap[index] == 1) {
                return i;
            }
        }
        return -1;
    }

    private int[] buildLetterCountChars(String source) {
        int[] chars = new int[26];
        char[] sourceChars = source.toCharArray();
        for (int i = 0; i < sourceChars.length; i++) {
            chars[sourceChars[i] - 97] = chars[sourceChars[i] - 97] + 1;
        }
        return chars;
    }
}
