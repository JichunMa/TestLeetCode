package number990;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hashMap.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            int maxLength = Math.max(words[i].length(), words[i + 1].length());
            for (int j = 0; j < maxLength; j++) {
                int x = j < words[i].length() ? hashMap.get(words[i].charAt(j)) : -1;
                int y = j < words[i + 1].length() ? hashMap.get(words[i + 1].charAt(j)) : -1;
                if (x == y) {
                    continue;
                } else if (x > y) {
                    return false;
                } else {
                    break;
                }
            }
        }
        return true;
    }

}
