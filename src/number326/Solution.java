package number326;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.isPowerOfThree(27);
        System.out.println(result);
    }

    public boolean isPowerOfThree(int n) {
        if (n < 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 != 0) {
            return false;
        }
        int i = 3;
        while (true) {
            if (n == i) {
                return true;
            } else if (n > i && n < i * 3) {
                return false;
            }
            i = i * 3;
        }
    }
}
