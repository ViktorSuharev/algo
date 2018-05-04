package com.visu.algo.string.sub;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class MultisetSubSequence implements SubSequenceFinder {

    @Override
    public int find(String text, String key) {
        char[] arr = text.toCharArray();

        Multiset<Character> etalon = getMultiset(key);
        Multiset<Character> pool = getMultiset(key);

        int i = -1;
        int textSize = text.length();
        int poolSize = key.length();

        while (++i < textSize && poolSize > 0) {
            char elem = arr[i];
            char startWindowElem = arr[i - (key.length() - poolSize)];

            // the pool has the elem
            if (pool.contains(elem)) {
                pool.remove(elem);
                poolSize--;
                continue;
            }

            // no elem in the key or elem differs start elem of seq
            if (!etalon.contains(elem) || elem != startWindowElem) {
                pool = getMultiset(key);
                poolSize = key.length();
                continue;
            }
        }

        return poolSize != 0 ? -1 : i - key.length();
    }

    private Multiset<Character> getMultiset(String key) {
        Multiset<Character> multiset = HashMultiset.create();
        for (char c : key.toCharArray()) multiset.add(c);

        return multiset;
    }
}
