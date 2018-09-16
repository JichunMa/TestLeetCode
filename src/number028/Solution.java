package number028;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.strStr("hello","ll");
        System.out.println(result);
    }

    public int strStr(String haystack, String needle) {
        if (haystack == null) {
            return -1;
        }
        if (needle == null) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
