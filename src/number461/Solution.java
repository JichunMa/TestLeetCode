package number461;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.hammingDistance(1, 4);
        System.out.println(result);
    }

    public int hammingDistance(int x, int y) {
        String binaryX = Integer.toBinaryString(x);
        String binaryY = Integer.toBinaryString(y);
        int lengthX = binaryX.length();
        int lengthY = binaryY.length();
        int minus = lengthX - lengthY;
        if (minus > 0) {
            binaryY = supplyZeroToHead(binaryY, minus);
        } else {
            binaryX = supplyZeroToHead(binaryX, -minus);
        }
        int differentCount = 0;
        int length = binaryX.toCharArray().length;
        char[] charsX = binaryX.toCharArray();
        char[] charsY = binaryY.toCharArray();
        for (int i = 0; i < length; i++) {
            if (charsX[i] != charsY[i]) {
                differentCount++;
            }
        }
        return differentCount;
    }

    private String supplyZeroToHead(String input, int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = number; i > 0; i--) {
            builder.append("0");
        }
        builder.append(input);
        return builder.toString();
    }
}
