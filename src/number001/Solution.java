package number001;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int results[] = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(results));
    }

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int firstNum;
        int secondNum;
        for (int i = 0; i < nums.length; i++) {
            firstNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                secondNum = nums[j];
                if (firstNum + secondNum == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return null;
    }


}
