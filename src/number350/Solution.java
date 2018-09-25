package number350;

// TODO: 2018/9/25
//进阶:
//        如果给定的数组已经排好序呢？你将如何优化你的算法？
//        如果 nums1 的大小比 nums2 小很多，哪种方法更优？
//        如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？

import java.util.ArrayList;
import java.util.HashMap;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array1 = {4,7,9,7,6,7};
        int[] array2 = {5,0,0,6,1,6,2,2,4};
        int[] results;
        results = solution.intersect(array1, array2);
        for (int result : results) {
            System.out.println(result);
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], 1 + map1.get(nums1[i]));
            } else {
                map1.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map1.containsKey(nums2[i])) {
                int newValue = map1.get(nums2[i]);
                if (newValue > 0) {
                    resultList.add(nums2[i]);
                    newValue--;
                    map1.put(nums2[i], newValue);
                }
            }
        }
        int[] ret = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            ret[i] = resultList.get(i);
        }
        return ret;
    }

}
