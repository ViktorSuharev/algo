package com.visu.algo.problem.addtwonums;

public class AddTwoNumber {

    public int[] add(int[] a, int[] b) {
        int maxLength = getMax(a.length, b.length);
        int[] result = new int[maxLength];
        int[] resultExt = new int[maxLength + 1];

        int sum;
        int rest = 0;
        for (int i = 0; i < maxLength; ++i) {
            sum = a[i] + b[i] + rest;
            result[i] = sum % 10;
            resultExt[i] = result[i];
            rest = sum / 10;
        }

        if (rest > 0) {
            resultExt[maxLength] = rest;
            return resultExt;
        }

        return result;
    }

    private int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
