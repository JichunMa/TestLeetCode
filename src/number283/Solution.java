package number283;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = {0, 1, 0, 3, 12};
        solution.moveZeroes(arrays);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void moveZeroes(int[] nums) {
        ArrayList<Integer> list = new ArrayList();
        int zeroCounts = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCounts++;
            } else {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < zeroCounts; i++) {
            list.add(0);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
    }

}
