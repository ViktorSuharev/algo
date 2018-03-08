package com.visu.algo.sort.bubble;

public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted = false;
        int unsortedSize = array.length;

        while(!isSorted) {
            isSorted = true;
            int maxPos = 0;
            for (int i = 1; i < unsortedSize; ++i) {
                if (array[i] < array[maxPos]) {
                    swap(array, i, maxPos);
                    isSorted = false;
                }
                maxPos = i;
            }
            unsortedSize--;
        }
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
