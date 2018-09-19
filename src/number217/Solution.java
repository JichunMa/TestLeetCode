package number217;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = {1,1,1,3,3,4,3,2,4,2};
        boolean result = solution.containsDuplicate(arrays);
        System.out.println(result);
    }

    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Set set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}
