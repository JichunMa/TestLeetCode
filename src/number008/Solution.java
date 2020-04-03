package number008;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num = "+-123";
        int result = solution.myAtoi(num);
        System.out.println(result);
    }


    public static int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        String source = str.trim();
        if (source.length() == 0) {
            return 0;
        }
        boolean isNavigate = false;
        StringBuilder builder = new StringBuilder();
        if (source.charAt(0) == 45 || source.charAt(0) == 43) {
            if (source.charAt(0) == 45) {
                isNavigate = true;
            }
            if (source.length() > 1) {
                if (!isDigit(source.charAt(1))) {
                    return 0;
                } else {
                    for (int i = 1; i < source.length(); i++) {
                        if (isDigit(source.charAt(i))) {
                            builder.append(source.charAt(i));
                        } else {
                            break;
                        }
                    }
                }
            } else {
                return 0;
            }
        } else {
            //首位非数字
            if (!isDigit(source.charAt(0))) {
                return 0;
            }

            for (int i = 0; i < source.length(); i++) {
                if (isDigit(source.charAt(i))) {
                    builder.append(source.charAt(i));
                } else {
                    break;
                }
            }
        }

        long result;
        if (isNavigate) {
            builder.insert(0, "-");
        }
        try {
            result = Long.parseLong(builder.toString());
        } catch (NumberFormatException e) {
            if (isNavigate){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) result;

    }

    public static boolean isDigit(char ch) {
        return ch >= 48 && ch <= 57;
    }
}
