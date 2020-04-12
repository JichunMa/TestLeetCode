package number146;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 有一个坑put时 相同元素不需要考虑map满的情况 直接入map即可
 */
public class Solution {
    static class LRUCache {

        Map<Integer, Integer> map;
        //前面的先离开
        List<Integer> list;
        int capacity;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>(capacity);
            list = new ArrayList<>(capacity);

        }

        public int get(int key) {
            if (map.containsKey(key)) {
                //挪到最后
                list.remove(new Integer(key));
                list.add(key);
                return map.get(key);
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            //更新操作不需要考虑删除情况
            if (map.containsKey(key)) {
                map.put(key, value);
                //挪到最后
                list.remove(new Integer(key));
                list.add(key);
            } else {
                if (map.size() == capacity) {
                    int removeKey = list.remove(0);
                    map.remove(removeKey);
                }
                map.put(key, value);
                list.add(key);
            }
        }
    }
}
