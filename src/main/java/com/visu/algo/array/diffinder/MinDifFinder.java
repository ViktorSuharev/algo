package com.visu.algo.array.diffinder;

import java.util.Arrays;

public class MinDifFinder {

    /**
     * search for min div from 2 arrays
     */
    public int find(int[] a, int[] b) {
        if (a == null || a.length == 0 || b == null || b.length == 0) return -1;

        int aLength = a.length;
        int bLength = b.length;

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0;
        int j = 0;
        int min = Math.abs(a[i] - b[j]);
        int dif = min;

        while (i < aLength || j < bLength) {
            dif = Math.abs(a[i] - b[j]);
            if (dif < min) min = dif;

            if (a[i] < b[j] && i < aLength - 1) i++;
            else if (a[i] > b[j] && j < bLength - 1) j++;
            else break;
        }

        return min;
    }
}
