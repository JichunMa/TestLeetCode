package number268;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 0, 1};
        System.out.println(solution.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        boolean[] array = new boolean[nums.length + 1];
        int index;
        for (int i = 0; i < nums.length; i++) {
            index = nums[i];
            array[index] = true;
        }
        for (int i = 0; i < array.length; i++) {
            if (!array[i]) {
                return i;
            }
        }
        return 0;
    }
}
