package com.visu.algo.fibonacci;

public class RecursiveFibonacci {

    public int getValue(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return getValue(n - 1) + getValue(n - 2);
    }
}
