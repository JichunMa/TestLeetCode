package number202;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int left = 0;
        int current = n;
        while (true) {
            if (current < 10) {
                //一位数不需要按位求平方和
                sum += current * current;
            } else {
                while (current > 0) {
                    left = current % 10;
                    sum += left * left;
                    current = current / 10;
                }
            }
            if (sum == 1) {
                return true;
            }
            if (set.contains(sum)) {
                //出现重复的数字说明进入死循环了
                return false;
            } else {
                set.add(sum);
            }
            current = sum;
            sum = 0;
        }
    }
}
