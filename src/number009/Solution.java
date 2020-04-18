package number009;

public class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length / 2; i++) {
            if (chs[i] != chs[chs.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
