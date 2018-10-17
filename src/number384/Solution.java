package number384;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Solution {
    int[] source;

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Solution solution = new Solution(array);
        int[] result = solution.shuffle();
        for (int i : result) {
            System.out.println(i);
        }
    }

    public Solution(int[] nums) {
        source = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return source;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if (source.length ==0){
            return source;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
            list.add(source[i]);
        }
        int[] result = new int[source.length];
        int i = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Random random = new Random();
            int index = random.nextInt(list.size());
            result[i] = list.remove(index);
            i++;
        }
        return result;
    }
}
