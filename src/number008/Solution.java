package number008;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String num = "42";
        int result = solution.myAtoi(num);
        System.out.println(result);
    }


    public int myAtoi(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        String digitalString = extractDigitalString(str);
        digitalString = trimFrontZero(digitalString);
        if (digitalString.equals("-") || digitalString.equals("+")) {
            return 0;
        }

        String strIntegerMax = String.valueOf(Integer.MAX_VALUE);
        String strIntegerMin = String.valueOf(Integer.MIN_VALUE);

        if (digitalString.indexOf('-') == 0) {
            if (digitalString.length() > strIntegerMin.length()) {
                return Integer.MIN_VALUE;
            } else if (digitalString.length() == strIntegerMin.length()) {
                if (digitalString.compareTo(strIntegerMin) > 0) {
                    return Integer.MIN_VALUE;
                }
            }
        } else {
            String digitalStringNoPlus = digitalString.replaceAll("[+]", "");
            if (digitalStringNoPlus.length() > strIntegerMax.length()) {
                return Integer.MAX_VALUE;
            } else if (digitalStringNoPlus.length() == strIntegerMax.length()) {
                if (digitalStringNoPlus.compareTo(strIntegerMax) > 0) {
                    return Integer.MAX_VALUE;
                }
            }
        }
        if (digitalString.equals("")) {
            return 0;
        }
        return Integer.parseInt(digitalString);
    }

    public String trimFrontZero(String source) {
        char[] chars = source.toCharArray();
        boolean isFrontZero = true;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (chars[0] == '-' || chars[0] == '+') {
                    builder.append(chars[0]);
                } else {
                    if (isFrontZero && chars[i] == '0') {
                        builder.append("");
                    } else {
                        isFrontZero = false;
                        builder.append(chars[i]);
                    }
                }
            } else {
                if (isFrontZero && chars[i] == '0') {
                    builder.append("");
                } else {
                    isFrontZero = false;
                    builder.append(chars[i]);
                }
            }
        }
        return builder.toString();
    }

    public String extractDigitalString(String source) {
        StringBuilder builder = new StringBuilder();
        if (source == null || source.equals("0")) {
            return "";
        }
        source = source.trim();
        char[] chars = source.toCharArray();
        boolean isMinus = false;
        boolean isPlus = false;
        boolean isDigital = false;

        for (int i = 0; i < chars.length; i++) {
            //减号
            char ch = chars[i];
            if (isMinus || isPlus) {
                if (ch >= 48 && ch <= 57) {
                    builder.append(ch);
                } else {
                    return builder.toString();
                }
            } else {
                if (ch == 45 || ch == 43) {
                    if (isDigital) {
                        return builder.toString();
                    } else {
                        if (isPlus || isMinus) {
                            return "";
                        } else {
                            builder.append(ch);
                            if (ch == 45) {
                                isMinus = true;
                            } else {
                                isPlus = true;
                            }
                        }
                    }
                } else if (ch >= 48 && ch <= 57) {
                    isDigital = true;
                    builder.append(ch);
                } else {
                    return builder.toString();
                }
            }
        }
        return builder.toString();
    }


}
