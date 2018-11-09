package number118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = buildList(result, i);
            result.add(list);
        }
        return result;
    }

    List<Integer> buildList(List<List<Integer>> list, int num) {
        List<Integer> res = new ArrayList<>();
        if (num == 1) {
            res.add(1);
        } else if (num == 2) {
            res.add(1);
            res.add(1);
        } else {
            int index = num - 1;
            res.add(1);
            List<Integer> lastList = list.get(index - 1);
            for (int i = 1; i < index; i++) {
                res.add(lastList.get(i - 1) + lastList.get(i));
            }
            res.add(1);
        }
        return res;
    }

}
