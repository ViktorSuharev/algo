package com.visu.algo.sort.insert;

import com.visu.algo.sort.Sorter;

public class InsertSorter implements Sorter {

    public void sort(int[] array) {
        int sortedSize = 1;
        for (int i = 1; i < array.length; ++i) {
            for (int j = 0; j < sortedSize; ++j) {
                if (array[j] > array[i]) {
                    shift(array, i, j);
                    break;
                }
            }
            sortedSize++;
        }
    }

    public void shift(int[] array, int current, int point) {
        int currentElem = array[current];
        for (int i = current; i > point; --i) {
            array[i] = array[i - 1];
        }
        array[point] = currentElem;
    }
}
