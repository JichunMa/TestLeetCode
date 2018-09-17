package number014;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] testString = {"dog","racecar","car"};
        String prefix = solution.longestCommonPrefix(testString);
        System.out.println(prefix);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        char objChar;
        boolean isContinue = true;
        for (int j = 0; j < strs[0].length() && isContinue; j++) {
            objChar = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j >= strs[i].length()) {
                    isContinue = false;
                } else if (strs[i].charAt(j) != objChar) {
                    isContinue = false;
                }
            }
            if(isContinue){
                builder.append(objChar);
            }
        }
        return builder.toString();
    }


}
