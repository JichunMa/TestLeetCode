package number088;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList();
        int indexOne = 0;
        int indexTwo = 0;
        while (indexOne < m && indexTwo < n) {
            if (nums1[indexOne] < nums2[indexTwo]) {
                list.add(nums1[indexOne]);
                indexOne++;
            } else {
                list.add(nums2[indexTwo]);
                indexTwo++;
            }
        }
        while (indexOne < m) {
            list.add(nums1[indexOne]);
            indexOne++;
        }
        while (indexTwo < n) {
            list.add(nums2[indexTwo]);
            indexTwo++;
        }
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }
}
