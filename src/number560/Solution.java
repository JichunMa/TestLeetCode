package number560;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }

    public static int subarraySum(int[] nums, int k) {
        //前为总和 后为次数
        int result = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int sum = 0;
        //默认值
        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (hashMap.containsKey(sum - k)) {
                result += hashMap.get(sum - k);
            }

            if (hashMap.containsKey(sum)) {
                int oldCount = hashMap.get(sum);
                oldCount++;
                hashMap.put(sum, oldCount);
            } else {
                hashMap.put(sum, 1);
            }

        }
        return result;
    }


    //题两数之和 两题比较类似
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
