package number049;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getStringLetterGroup("ads"));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap();
        for (int i = 0; i < strs.length; i++) {

            String key = getStringLetterGroup(strs[i]);
            if (hashMap.containsKey(key)) {
                List<String> list = hashMap.get(key);
                list.add(strs[i]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(key, list);
            }
        }
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            result.add(hashMap.get(iterator.next()));
        }
        return result;
    }

    public static String getStringLetterGroup(String source) {
        int[] counts = new int[26];
        char[] keys = {'a', 'b', 'c', 'd',
                'e',
                'f',
                'g',
                'h',
                'i',
                'j',
                'k',
                'l',
                'm',
                'n',
                'o',
                'p',
                'q',
                'r',
                's',
                't',
                'u',
                'v',
                'w',
                'x',
                'y',
                'z'};
        for (int i = 0; i < source.length(); i++) {
            int index = source.charAt(i) - 'a';
            counts[index] = counts[index] + 1;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                builder.append(keys[i]);
                builder.append(counts[i]);
            }
        }
        return builder.toString();
    }
}
