package com.visu.algo.string.sub;

import java.util.HashMap;
import java.util.Map;

public class HashMapSubSequenceFinder implements SubSequenceFinder {

    @Override
    public int find(String text, String key) {
        char[] arr = text.toCharArray();

        Map<Character, Integer> etalon = getMap(key);
        Map<Character, Integer> pool = new HashMap<>(etalon);

        int i = -1;
        int textSize = text.length();
        int poolSize = key.length();

        while (++i < textSize && poolSize > 0) {
            char elem = arr[i];
            char startWindowElem = arr[i - (key.length() - poolSize)];
            Integer elemCount = pool.get(elem);

            // the pool has the elem
            if (elemCount != null && elemCount.compareTo(0) > 0) {
                pool.put(elem, elemCount - 1);
                poolSize--;
                continue;
            }

            // no elem in the key or elem differs start elem of seq
            if (etalon.get(elem) == null || elem != startWindowElem) {
                pool = new HashMap(etalon);
                poolSize = key.length();
                continue;
            }
        }

        return poolSize != 0 ? -1 : i - key.length();
    }

    private Map<Character, Integer> getMap(String key) {
        Map<Character, Integer> res = new HashMap<>();
        for (char c : key.toCharArray()) res.merge(c, 1, Integer::sum);

        return res;
    }
}
