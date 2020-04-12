import number098.TreeNode;

import java.util.*;

public class Solution {


    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        System.out.println(cache.get(2));   // 返回  1
        cache.put(3, 6);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        cache.put(1, 2);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }

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

