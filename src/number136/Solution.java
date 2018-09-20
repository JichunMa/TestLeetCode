package number136;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = {2,2,1};
        int result = solution.singleNumber(arrays);
        System.out.println(result);
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                if (nums[0] != nums[1]) {
                    return nums[0];
                }
            } else {
                if ((nums[i] != nums[i + 1]) && (nums[i] != nums[i - 1])) {
                    return nums[i];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
