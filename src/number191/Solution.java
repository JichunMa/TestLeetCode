package number191;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(11));
    }

    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }
        String data = Integer.toBinaryString(n);
        int result = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}
