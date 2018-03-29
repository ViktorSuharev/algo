package com.visu.algo.search.binary;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearcherTest {

    private static final int ELEMENT_NOT_FOUND = -1;
    private double[] elements = new double[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private final BinarySearcher searcher = new BinarySearcher();

    @Test
    public void binarySearch() throws Exception {
        Assert.assertEquals(6, searcher.binarySearch(elements, 7));
    }

    @Test
    public void binarySearchFirst() throws Exception {
        Assert.assertEquals(0, searcher.binarySearch(elements, 1));
    }

    @Test
    public void binarySearchLast() throws Exception {
        Assert.assertEquals(9, searcher.binarySearch(elements, 10));
    }

    @Test
    public void binarySearchNotFoundMiddle() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.binarySearch(elements, 5.5));
    }

    @Test
    public void binarySearchNotFoundBefore() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.binarySearch(elements, 11));
    }

    @Test
    public void binarySearchNotFoundAfter() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.binarySearch(elements, 0));
    }
}
