package com.visu.algo.sort.bubble;

import com.visu.algo.sort.Sorter;
import org.junit.Assert;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class BubbleSorterTest {

    private static int[] ARRAY = {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
    private static int[] SORTED = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private final Sorter sorter = new BubbleSorter();

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
        sorter.sort(array);
        printArray(array);

        Assert.assertArrayEquals(sorted, array);
    }
}
