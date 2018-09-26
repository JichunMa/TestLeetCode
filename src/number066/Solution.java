package number066;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = { 9};
        int[] result = solution.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            stack.push(digits[i]);
        }
        boolean isFirst = true;
        boolean isNeedCarry = false;
        while (!stack.empty()) {
            int curry = stack.pop();
            if (isFirst) {
                isFirst = false;
                curry = curry + 1;
                if (curry > 9) {
                    curry = 0;
                    isNeedCarry = true;
                }
            } else {
                if (isNeedCarry) {
                    curry = curry + 1;
                    if (curry > 9) {
                        curry = 0;
                        isNeedCarry = true;
                    }else {
                        isNeedCarry = false;
                    }
                } else {
                    //无进位，不需要进行+1
                }
            }
            list.add(curry);
        }
        if (isNeedCarry) {
            list.add(1);
        }
        int[] resultArray = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            resultArray[j] = list.get(list.size() - 1 - j);
        }
        return resultArray;
    }
}
