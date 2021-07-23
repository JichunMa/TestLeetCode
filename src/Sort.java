import java.util.LinkedList;

public class Sort {

    //排序都是由小到大
    public static void main(String[] args) {
        int[] nums = {2, 35, 6, 7, 21, 7};
        new Sort().mergeSort(nums, 0, nums.length - 1);
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

    //简单选择
    //选最小的和当前位互换
    void sampleChoose(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIdx = j;
                }
            }
            nums[minIdx] = nums[i];
            nums[i] = min;
        }
    }

    //插入排序
    //认为前面是有序的数组了 然后找自己应该在的位置进去即可
    void insertSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int current = nums[i];
            //在有序数组中找自己的合适位置
            //向前找
            int j = i;
            for (; j > 0 && nums[j - 1] > current; j--) {
                nums[j] = nums[j - 1];
            }
            nums[j] = current;
        }
    }

    //希尔排序
    //增量分隔后 在小组内进行插入排序
    void shellSort(int[] nums) {
        int n = nums.length;
        //分组
        for (int k = n / 2; k > 0; k = k / 2) {
            // i 相当于组内的第二个元素，认为第一个元素已经是一个有序的序列
            for (int i = k; i < n; i++) {
                //组内进行插入排序
                for (int j = i; j - k >= 0; j = j - k) {
                    if (nums[j] < nums[j - k]) {
                        int swap = nums[j];
                        nums[j] = nums[j - k];
                        nums[j - k] = swap;
                    }
                }
            }
        }
    }

    //归并排序
    public void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        //分两部分
        int middle = start + (end - start) / 2;

        //两部分各自计算
        mergeSort(nums, start, middle);
        mergeSort(nums, middle + 1, end);


        //合并两部分
        int lIdx = start; //终点为middle
        int rIdx = middle + 1; //终点为end

        LinkedList<Integer> list = new LinkedList<>();
        while (lIdx <= middle && rIdx <= end) {
            if (nums[lIdx] < nums[rIdx]) {
                list.add(nums[lIdx]);
                lIdx++;
            } else {
                list.add(nums[rIdx]);
                rIdx++;
            }
        }

        //处理尾巴
        while (lIdx <= middle) {
            list.add(nums[lIdx]);
            lIdx++;
        }

        while (rIdx <= end) {
            list.add(nums[rIdx]);
            rIdx++;
        }
        //将区间[start,end]之间的还原到原数组中
        for (int i = start; i <= end; i++) {
            nums[i] = list.removeFirst();
        }
    }

}
