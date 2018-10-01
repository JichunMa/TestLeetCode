package number412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List list = solution.fizzBuzz(15);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }


    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                flag = flag + 1;
            }
            if (i % 5 == 0) {
                flag = flag + 3;
            }
            if (flag == 0) {
                list.add(String.valueOf(i));
            } else if (flag == 1) {
                list.add("Fizz");
            } else if (flag == 3) {
                list.add("Buzz");
            } else if (flag == 4) {
                list.add("FizzBuzz");
            }
            flag = 0;
        }
        return list;
    }
}
