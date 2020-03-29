package number415;

public class Solution {

    public static void main(String[] args) {
        String num1 = "99";
        String num2 = "9";
        System.out.println(addStrings(num1, num2));

    }

    public static String addStrings(String num1, String num2) {
        boolean isHasCarry = false;

        StringBuilder builder = new StringBuilder();
        if (num1 == null || num1 == "") {
            return num2;
        }
        if (num2 == null || num2 == "") {
            return num1;
        }
        char[] chs1 = num1.toCharArray();
        char[] chs2 = num2.toCharArray();

        int real1 = chs1.length - 1;
        int real2 = chs2.length - 1;

        while (real1 >= 0 && real2 >= 0) {
            int result;
            result = getNumber(chs1[real1]) + getNumber(chs2[real2]);
            if (isHasCarry) {
                result = result + 1;
                isHasCarry = false;
            }
            if (result >= 10) {
                result = result % 10;
                isHasCarry = true;
            }
            builder.insert(0, result);
            real1--;
            real2--;
        }

        if (real1 >= 0) {
            int result;
            while (real1 >= 0) {
                result = getNumber(chs1[real1]);
                if (isHasCarry) {
                    result = result + 1;
                    isHasCarry = false;
                }
                if (result >= 10) {
                    result = result % 10;
                    isHasCarry = true;
                }
                builder.insert(0, result);
                real1--;
            }
        } else if (real2 >= 0) {
            int result;
            while (real2 >= 0) {
                result = getNumber(chs2[real2]);
                if (isHasCarry) {
                    result = result + 1;
                    isHasCarry = false;
                }
                if (result >= 10) {
                    result = result % 10;
                    isHasCarry = true;
                }
                builder.insert(0, result);
                real2--;
            }
        }
        if (isHasCarry) {
            builder.insert(0, 1);
        }

        return builder.toString();
    }

    public static int getNumber(char ch) {
        //0 对应的 ASCII 码为0
        return ch - 48;
    }
}
