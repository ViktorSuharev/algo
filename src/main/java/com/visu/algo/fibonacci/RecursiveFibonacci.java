package com.visu.sandbox.algo.fibonacci;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        System.out.println(RecursiveFibonacci.getValue(9));
    }

    public static int getValue(int n) {
        if (n <= 2) return 1;

        return getValue(n - 1) + getValue(n - 2);
    }
}
