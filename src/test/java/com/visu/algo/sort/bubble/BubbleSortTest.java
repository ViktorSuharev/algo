package com.visu.algo.sort.bubble;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    private static int[] ARRAY = {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
    private static int[] SORTED = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Test
    public void testSortArray() {
        testSort(ARRAY, SORTED);
    }

    @Test
    public void testSortSingleArray() {
        int[] singleArray = {1};
        testSort(singleArray, singleArray);
    }

    private void testSort(int[] array, int[] sorted) {
        printArray(array);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);

        printArray(array);
        Assert.assertArrayEquals(sorted, array);
    }

    private void printArray(int[] array) {
        System.out.println();
        System.out.print("[");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.print("]");
    }
}
