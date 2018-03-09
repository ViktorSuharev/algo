package com.visu.algo.sort.select;

import com.visu.algo.sort.TestUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class SelectSorterTest {

    private static int[] array;
    private static int[] sorted;

    private final SelectSorter sorter = new SelectSorter();

    @Before
    public void setUp() {
        array   = new int[] {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
        sorted  = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
    }

    @Test
    public void testGetMin() throws Exception {
        TestUtil.printArray(array);
        int min = sorter.getMinIndex(array, 2);
        TestUtil.printArray(array);

        Assert.assertEquals(3, min);
    }

    @Test
    public void testSortArray() throws Exception {
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
