package number692;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (hashMap.containsKey(words[i])) {
                int count = hashMap.get(words[i]);
                count++;
                hashMap.put(words[i], count);
            } else {
                hashMap.put(words[i], 1);
            }
        }
        List<String> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list, new MyComparator(hashMap));
        return list.subList(0, k);

    }

    class MyComparator implements Comparator<String> {
        HashMap<String, Integer> map;

        public MyComparator(HashMap<String, Integer> map) {
            this.map = map;
        }


        @Override
        public int compare(String s1, String s2) {
            int count1 = map.get(s1);
            int count2 = map.get(s2);
            if (count1 == count2) {
                //同count谁小谁在前
                return s1.compareTo(s2);
            } else {
                //count 按倒序排列
                return count2 - count1;
            }

        }
    }
}
