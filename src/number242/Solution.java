package number242;

public class Solution {

    private static final int ACorrespondIndex = 97;

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isAnagram("abcad","dcab");
        System.out.println(result);
    }

    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if ("".equals(s) && s.equals(t)) {
            return true;
        }
        int[] charsForS = buildLetterCountChars(s);
        int[] charsForT = buildLetterCountChars(t);
        for (int i = 0; i < charsForS.length; i++) {
            if (charsForS[i] != charsForT[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] buildLetterCountChars(String source) {
        int[] chars = new int[26];
        char[] sourceChars = source.toCharArray();


        for (char ch:sourceChars){
            chars[ch - ACorrespondIndex] = chars[ch - ACorrespondIndex] + 1;
        }
        return chars;
    }
}
