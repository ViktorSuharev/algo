package com.visu.algo.sort.insert;

import com.visu.algo.sort.TestUtil;
import org.junit.Assert;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class InsertSorterTest {

    private static int[] ARRAY = {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
    private static int[] SHIFTED = {3, 2, 7, 6, 1, 5, 4, 10, 9, 8};
    private static int[] SORTED = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private final InsertSorter sorter = new InsertSorter();

    @Test
    public void testShift() {
        TestUtil.printArray(ARRAY);
        sorter.shift(ARRAY, 7, 2);
        TestUtil.printArray(ARRAY);

        Assert.assertArrayEquals(ARRAY, SHIFTED);
    }

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
