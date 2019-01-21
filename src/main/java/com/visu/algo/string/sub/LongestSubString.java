package com.visu.algo.string.sub;

import java.util.LinkedList;
import java.util.List;

public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int maxLength = 0;

        List<Character> sub = new LinkedList<>();
        for (char c : arr) {
            if (sub.contains(c)) {
                while (sub.get(0) != c) {
                    sub.remove(0);
                }
                sub.remove(0);
            }

            sub.add(c);
            if (maxLength < sub.size()) {
                maxLength = sub.size();
            }
        }

        return maxLength;
    }
}
