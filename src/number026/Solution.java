package number026;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = new int[]{1, 2, 2};
        int result = solution.removeDuplicates(arrays);
        for (int i = 0; i < result; i++) {
            System.out.println(arrays[i]);
        }

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int resultsLength = 1;
        int index = -1;
        int lastDigit = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (index == -1) {
                if (nums[i] == lastDigit) {
                    index = i;
                } else {
                    lastDigit = nums[i];
                    resultsLength++;
                }
            } else {
                if (nums[i] != lastDigit) {
                    lastDigit = nums[i];
                    nums[index] = nums[i];
                    index++;
                    resultsLength++;
                }
            }
        }
        return resultsLength;

    }
}
