package com.visu.algo.sort.merge;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.visu.algo.sort.TestUtil.printArray;

public class MergeSorterTest {

    private static int[] array;
    private static int[] sortedArray1;
    private static int[] sortedArray2;
    private static int[] EXPECTED_SORTED;
    private static int[] EXPECTED_MERGED;

    private final MergeSorter sorter = new MergeSorter();

    @Before
    public void setUp() {
        array        = new int[] {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
        sortedArray1 = new int[] {1, 4, 7, 8};
        sortedArray2 = new int[] {1, 2, 3, 5, 6};
        EXPECTED_SORTED = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        EXPECTED_MERGED = new int[] {1, 1, 2, 3, 4, 5, 6, 7, 8};
    }

    @Test
    public void testMerge() throws Exception {
        int[] merged = new int[9];
        sorter.merge(merged, sortedArray1, sortedArray2);
        Assert.assertArrayEquals(EXPECTED_MERGED, merged);
    }

    @Test
    public void testSortSingleArray() {
        int[] singleArray = {1};
        testSort(singleArray, singleArray);
    }

    @Test
    public void testSort() throws Exception {
        testSort(EXPECTED_SORTED, array);
    }

    private void testSort(int[] expected, int[] sorted) {
        printArray(sorted);
        sorter.sort(sorted);
        printArray(sorted);

        Assert.assertArrayEquals(expected, sorted);
    }
}
