package com.visu.algo.fibonacci;

import java.util.List;

public interface Fibonacci {

    List<Integer> getSequence(int n);

    default int getValue(int n) {
        List<Integer> list = getSequence(n);
        return list.get(list.size() - 1);
    }
}
