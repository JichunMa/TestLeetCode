import number002.ListNode;
import sun.nio.cs.ArrayEncoder;

import java.util.Arrays;
import java.util.Stack;


public class Solution {


    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }


    public static int mySqrt(int x) {
        for (long i = 0; i <= x; i++) {
            long tmp = i * i;
            if (tmp == x) {
                return (int) i;
            } else {
                if (tmp > x) {
                    return (int) (i - 1);
                }
            }
        }
        return 0;
    }



}
