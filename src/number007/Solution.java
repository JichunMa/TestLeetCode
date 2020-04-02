package number007;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
    }


    public static int reverse(int x) {

        long result = 0;
        Stack<Integer> stack = new Stack<>();
        boolean isNegative = x < 0;
        long longX = x;
        if (isNegative) {
            longX = -longX;
        }

        if (longX < 10) {
            return x;
        }
        int num;
        while (longX > 0) {
            num = (int) (longX % 10);
            stack.push(num);
            longX = longX / 10;
        }
        int index = 0;
        while (!stack.empty()) {
            result += Math.pow(10, index) * stack.pop();
            index++;
        }
        if (isNegative) {
            result = 0 - result;
        }
        //比较边界值
        if (result < Integer.MIN_VALUE) {
            return 0;
        }
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
