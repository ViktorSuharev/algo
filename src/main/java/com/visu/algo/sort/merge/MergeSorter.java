package com.visu.algo.sort.merge;

import com.visu.algo.sort.Sorter;

public class MergeSorter implements Sorter {

    @Override
    public void sort(int[] array) {

        int divPoint = array.length/2;
        int[] left =  new int[divPoint];
        int[] right = new int[array.length - divPoint];
        System.arraycopy(array, 0, left, divPoint, divPoint);
    }

    public int[] mergeSorted(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < result.length; ++i) {
            if (firstIndex == first.length) {
                completeArray(result, i, second, secondIndex);
                break;
            }

            if (secondIndex == second.length) {
                completeArray(result, i, first, firstIndex);
                break;
            }

            if (first[firstIndex] < second[secondIndex]) {
                result[i] = first[firstIndex++];
            } else {
                result[i] = second[secondIndex++];
            }
        }

        return result;
    }

    public void completeArray(int[] array, int arrayPos, int[] items, int itemsPosition) {
        for (int i = 0; i < items.length - itemsPosition; ++i) {
            array[arrayPos + i] = items[itemsPosition + i];
        }
    }
}
