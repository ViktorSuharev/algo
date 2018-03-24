package com.visu.algo.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class RecursiveCacheFibonacci {

    private static Map<Integer, Integer> cache = new HashMap<>();

    static {
        cache.put(1, 1);
        cache.put(2, 1);
    }

    public static void main(String[] args) {
        System.out.println(RecursiveCacheFibonacci.getValue(10));
    }

    public static int getValue(int n) {
        if (cache.containsKey(n)) return cache.get(n);

        int result = getValue(n - 1) + getValue(n - 2);
        cache.put(n, result);

        return result;
    }
}
