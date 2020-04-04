package number001;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int results[] = solution.twoSum(nums, 9);
        System.out.println(Arrays.toString(results));
    }

    public static int[] twoSum(int[] nums, int target) {
        //前为值 后为索引
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                result[0] = hashMap.get(target - nums[1]);
                result[1] = i;
                break;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }


}
