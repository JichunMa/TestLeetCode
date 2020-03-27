package number680;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.validPalindrome("abc");
        System.out.println(result);
    }

    public static boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        if (s.length() < 2) {
            return true;
        }

        return isValid(s.toCharArray(), 0, s.length() - 1, 1);
    }

    public static boolean isValid(char[] chs, int head, int real, int retryCount) {
        while (head < real) {
            if (chs[head] == chs[real]) {
                head++;
                real--;
            } else {
                if (retryCount == 0) {
                    return false;
                }
                return isValid(chs, head + 1, real, retryCount - 1) || isValid(chs, head, real - 1, retryCount - 1);
            }
        }
        return true;
    }
}
