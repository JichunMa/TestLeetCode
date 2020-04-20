package number108;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>(i);
            int length = i;
            List<Integer> lastList = null;
            if (i >= 3) {
                lastList = result.get(i - 2);
            }
            //每层中间元素的添加
            for (int j = 0; j < length; j++) {
                if (j == 0 || j == length - 1) {
                    list.add(1);
                } else {
                    int num = lastList.get(j - 1) + lastList.get(j);
                    list.add(num);
                }
            }
            result.add(list);
        }
        return result;
    }
}
