package com.visu.algo.sort.insert;

import com.visu.algo.sort.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class InsertSorterTest {

    private static int[] array;
    private static int[] shifted;
    private static int[] sorted;

    private final InsertSorter sorter = new InsertSorter();

    @Before
    public void setUp() {
        array   = new int[] {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
        shifted = new int[] {3, 2, 7, 6, 1, 5, 4, 10, 9, 8};
        sorted  = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
    }

    @Test
    public void testShift() {
        TestUtil.printArray(array);
        sorter.shift(array, 7, 2);
        TestUtil.printArray(array);

        Assert.assertArrayEquals(array, shifted);
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
