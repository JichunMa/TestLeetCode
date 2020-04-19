package number069;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt2(8));

    }

    public static int mySqrt(int x) {
        for (long i = 0; i <= x; i++) {
            long tmp = (long) i * i;
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

    public int mySqrt2(int x) {
        if (x < 2) {
            return x;
        }
        int l = 2;
        int r = x / 2;
        int middle;
        while (l <= r) {
            middle = (l + r) / 2;
            long tmp = (long)middle*middle;
            if (tmp == x) {
                return middle;
            } else {
                if (tmp < x) {
                    l = middle + 1;
                } else {
                    r = middle - 1;
                }
            }
        }
        return r;
    }
}
