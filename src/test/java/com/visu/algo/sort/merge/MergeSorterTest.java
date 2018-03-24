package com.visu.algo.sort.merge;

import com.visu.algo.sort.TestUtil;
import com.visu.algo.sort.insert.InsertSorter;
import org.junit.Before;
import org.junit.Test;

public class MergeSorterTest {

    private static int[] array;
    private static int[] sorted;
    private static int[] sortedArray1;
    private static int[] sortedArray2;


    private final MergeSorter sorter = new MergeSorter();

    @Before
    public void setUp() {
        array   = new int[] {3, 2, 6, 1, 5, 4, 10, 7, 9, 8};
        sorted  = new int[] {1, 2, 3, 4, 5, 6, 7,  8, 9, 10};
        sortedArray1 = new int[] {1, 4, 7, 8};
        sortedArray2 = new int[] {1, 2, 3, 5, 6};
    }

    @Test
    public void testSort() throws Exception {
        int[] result = sorter.mergeSorted(sortedArray1, sortedArray2);
        TestUtil.printArray(result);
    }

    @Test
    public void testMergeSorted() throws Exception {

    }

}
