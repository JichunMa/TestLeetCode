package number053;

public class Solution {
    //贪心算法
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + nums[i - 1] > nums[i]) {
                nums[i] = nums[i] + nums[i - 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
