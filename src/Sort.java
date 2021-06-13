public class Sort {

    //排序都是由小到大
    public static void main(String[] args) {
        int[] nums = {2, 35, 6, 7, 21, 7};
        new Sort().quickSort(nums, 0, nums.length - 1);
        for (int item : nums) {
            System.out.println(item);
        }
    }

    //冒泡排序
    //冒泡 两两交换 每次将最大的置换到末尾
    void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int swap = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = swap;
                }
            }
        }
    }

    void quickSort(int[] nums, int begin, int end) {

        //！！递归注意越界问题
        if (begin >= end) {
            return;
        }

        int key = nums[begin];
        int i = begin;
        int j = end;
        //两头找使 key在最中间 左边小于k 右边大于k
        while (i < j) {
            //因为begin选的第一个 所以先遍历后面的
            while (i < j && nums[j] > key) {
                j--;
            }
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && nums[i] < key) {
                i++;
            }
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = key;
        quickSort(nums, begin, i - 1);
        quickSort(nums, i + 1, end);
    }
}
