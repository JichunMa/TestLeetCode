package number125;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome("race a car");
        System.out.println(result);
    }

    public boolean isPalindrome(String s) {
        if (null == s || s.equals("")) {
            return true;
        }
        String stringRemoveSymbol = s.replaceAll("[^a-z^A-Z^0-9]", "");
        stringRemoveSymbol = stringRemoveSymbol.toLowerCase();
        char[] chars = stringRemoveSymbol.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
