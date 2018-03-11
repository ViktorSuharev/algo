package com.visu.algo.sort.quick;

import com.visu.algo.sort.insert.InsertSorter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class QuickSorterTest {

    private static int[] array;
    private static int[] sorted;

    private final QuickSorter sorter = new QuickSorter();

    @Before
    public void setUp() {
        array   = new int[] {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
        sorted  = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
    }

    @Test
    public void testSortArray() {
        testSort(array, sorted);
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
