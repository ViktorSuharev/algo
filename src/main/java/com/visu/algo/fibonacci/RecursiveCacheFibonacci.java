package com.visu.algo.fibonacci;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecursiveCacheFibonacci implements Fibonacci {

    private static Map<Integer, Integer> sequence = new HashMap<Integer, Integer>() {{put(1, 1); put(2, 1);}};

    @Override
    public List<Integer> getSequence(int n) {
        getValue(n);
        return sequence.values()
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public int getValue(int n) {
        if (sequence.containsKey(n)) return sequence.get(n);

        int result = getValue(n - 1) + getValue(n - 2);
        sequence.put(n, result);

        return result;
    }
}
