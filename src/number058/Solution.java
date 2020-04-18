package number058;

public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        if (s.trim().length() == 0) {
            return 0;
        }
        if (s.indexOf(" ") == -1) {
            return s.length();
        }

        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
