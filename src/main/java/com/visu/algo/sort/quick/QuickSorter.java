package com.visu.algo.sort.quick;

import com.visu.algo.sort.Sorter;

public class QuickSorter implements Sorter {

    public void sort(int[] array) {
        sort(array, Pivot.MIDDLE);
    }

    public void sort(int[] array, Pivot pivotType) {
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        int pivot = getPivot(pivotType, leftBorder, rightBorder);
        sortSubArray(array, leftBorder, rightBorder, pivot);
    }

    private void sortSubArray(int[] array, int leftBorder, int rightBorder, int pivot) {
        if (leftBorder >= rightBorder) {
            return;
        }

        double pivotValue = array[pivot];
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int curIndex = leftBorder; curIndex <= rightBorder; curIndex++) {
                if (((array[curIndex] < pivotValue) && (curIndex > pivot))
                        || ((array[curIndex] >= pivotValue) && (curIndex < pivot))) {
                    swap(array, curIndex, pivot);
                    pivot = curIndex;
                    sorted = false;
                }
            }
        }
        if (leftBorder != pivot) {
            sortSubArray(array, leftBorder, pivot - 1, getMiddlePivot(leftBorder, pivot - 1));
            sortSubArray(array, pivot, rightBorder, getMiddlePivot(pivot, rightBorder));
        }
    }

    private int getPivot(Pivot pivotType, int leftBorder, int rightBorder) {
        int pivot;
        switch(pivotType) {
            case FIRST:
                pivot = getFirstPivot(leftBorder);
                break;
            case MIDDLE:
                pivot = getMiddlePivot(leftBorder, rightBorder);
                break;
            case LAST:
                pivot = getLastPivot(rightBorder);
                break;

            default:
                System.out.println("Specified pivot type is not supported. \n" +
                        "Middle Pivot will be used as a default");
                pivot = getMiddlePivot(leftBorder, rightBorder);
                break;
        }

        return pivot;
    }

    private int getFirstPivot(int leftBorder) {
        return leftBorder;
    }

    private int getMiddlePivot(int leftBorder, int rightBorder) {
        return leftBorder + (rightBorder - leftBorder) / 2;
    }

    private int getLastPivot(int rightBorder) {
        return rightBorder;
    }

    private void swap(int[] array, int first, int second) {
        int firstValue = array[first];
        array[first] = array[second];
        array[second] = firstValue;
    }
}
