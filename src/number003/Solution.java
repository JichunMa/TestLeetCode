package number003;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(10);
        System.out.println(result);
    }
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String data = String.valueOf(x);
        char[] chars = data.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            if (chars[i] != chars[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
