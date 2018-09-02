package number004;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.reverse(-2147483648);
        System.out.println(result);
    }

    public int reverse(int x) {
        boolean isNegativeNumber = false;
        long absX = x;
        Long longX = new Long(x);
        if (x < 0) {
            isNegativeNumber = true;
            absX = 0 - longX;
        }
        String strData = String.valueOf(absX);
        String reverseString = reverseString(strData);
        Long result = Long.parseLong(reverseString);
        if (isNegativeNumber) {
            result = 0 - result;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return result.intValue();
    }

    public String reverseString(String source) {
        char[] chars = source.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
