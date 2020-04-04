import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        twoSum(nums, 6);
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

