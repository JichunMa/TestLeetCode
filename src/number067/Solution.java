package number067;

public class Solution {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        if (a == null || a.length() == 0) {
            return b;
        }

        if (b == null || b.length() == 0) {
            return a;
        }
        StringBuilder builder = new StringBuilder();

        int lengthA = a.length();
        int lengthB = b.length();
        int aIndex = lengthA - 1;
        int bIndex = lengthB - 1;
        //是否有进位
        boolean isCarry = false;
        while (aIndex >= 0 && bIndex >= 0) {
            int aValue = getValue(a.charAt(aIndex));
            int bValue = getValue(b.charAt(bIndex));
            int sum = aValue + bValue;
            if (isCarry) {
                sum = sum + 1;
                isCarry = false;
            }
            //sum值为0，1，2，3
            if (sum >= 2) {
                builder.insert(0, sum % 2);
                isCarry = true;
            } else {
                builder.insert(0, sum);
            }
            aIndex--;
            bIndex--;
        }

        //处理 b 比 a 长
        while (bIndex >= 0) {
            int sum;
            sum = getValue(b.charAt(bIndex));
            if (isCarry) {
                sum++;
                isCarry = false;
            }
            if (sum >= 2) {
                builder.insert(0, sum % 2);
                isCarry = true;
            } else {
                builder.insert(0, sum);
            }
            bIndex--;
        }

        //处理 a 比 b 长
        while (aIndex >= 0) {
            int sum;
            sum = getValue(a.charAt(aIndex));
            if (isCarry) {
                sum++;
                isCarry = false;
            }
            if (sum >= 2) {
                builder.insert(0, sum % 2);
                isCarry = true;
            } else {
                builder.insert(0, sum);
            }
            aIndex--;
        }

        if (isCarry) {
            builder.insert(0, "1");
        }
        return builder.toString();

    }

    public static int getValue(char ch) {
        return ch - '0';
    }
}
