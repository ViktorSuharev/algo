package com.visu.algo.sort.select;

import com.visu.algo.sort.Sorter;

public class SelectSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int minIndex = getMinIndex(array, i);
            swap(array, i, minIndex);
        }
    }

    public int getMinIndex(int[] array, int begin) {
        int minIndex = begin;

        for (int i = begin; i < array.length; ++i) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
