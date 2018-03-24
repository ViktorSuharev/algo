package com.visu.sandbox.algo.fibonacci;

public class DynamicFibonacci {

    public static void main(String[] args) {
        System.out.println(DynamicFibonacci.getValue(10));
    }

    public static int getValue(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; ++i) {
            int current = a + b;
            a = b;
            b = current;
        }

        return a;
    }
}
