package number035;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else {
                if (nums[i] > target) {
                    return i - 1;
                }
            }
        }
        return nums.length;
    }

    public int searchInsert2(int[] nums, int target) {
        int r = nums.length-1;
        int l = 0;
        int middle;
        while (l<=r) {
            middle = (l + r) / 2 ;
            if (nums[middle] < target) {
                l = middle + 1;
            } else if (nums[middle] == target) {
                return middle;
            } else {
                r = middle - 1;
            }
        }
        return l;
    }


}
