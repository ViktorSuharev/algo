package com.visu.algo.sort.merge;

import com.visu.algo.sort.Sorter;

public class MergeSorter implements Sorter {

    @Override
    public void sort(int[] array) {
        if (array.length == 1) {
            return;
        }

        int[] left  = getLeft(array);
        int[] right = getRight(array);

        sort(left);
        sort(right);
        merge(array, left, right);
    }

    private int[] getLeft(int[] array) {
        int divPoint = array.length / 2;
        int[] left =  new int[divPoint];

        System.arraycopy(array, 0, left, 0, left.length);

        return left;
    }

    private int[] getRight(int[] array) {
        int divPoint = array.length / 2;
        int[] right = new int[array.length - divPoint];

        System.arraycopy(array, divPoint, right, 0, right.length);

        return right;
    }

    public void merge(int[] array, int[] first, int[] second) {
        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < array.length; ++i) {
            if (firstIndex == first.length) {
                completeArray(array, i, second, secondIndex);
                break;
            }

            if (secondIndex == second.length) {
                completeArray(array, i, first, firstIndex);
                break;
            }

            array[i] = (first[firstIndex] < second[secondIndex]) ?
                    first[firstIndex++] : second[secondIndex++];
        }
    }

    private void completeArray(int[] array, int arrayPos, int[] items, int itemsPosition) {
        System.arraycopy(items, itemsPosition, array, arrayPos, items.length - itemsPosition);
    }
}
