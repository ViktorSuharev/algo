package com.visu.algo.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class DynamicFibonacci implements Fibonacci {

    @Override
    public List<Integer> getSequence(int n) {
        List<Integer> list = new ArrayList<>();

        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; ++i) {
            list.add(a);
            int current = a + b;
            a = b;
            b = current;
        }

        return list;
    }
}
