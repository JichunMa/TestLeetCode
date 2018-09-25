package number189;

// TODO: 2018/9/25  需求3种方式实现已经完成(1/3)
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arrays = {-1,-100,3,99};
        solution.rotate(arrays, 2);
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length == 0) {
            return;
        }
        int tmp;
        for (int i = k; i > 0; i--) {
            tmp = nums[length - 1];
            for (int j = length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = tmp;
        }
    }
}
