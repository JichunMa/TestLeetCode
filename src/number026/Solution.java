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
        int lastValue = nums[0];
        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != lastValue) {
                nums[i] = nums[j];
                i++;
                lastValue = nums[j];
            }
        }
        return i;
    }
}
