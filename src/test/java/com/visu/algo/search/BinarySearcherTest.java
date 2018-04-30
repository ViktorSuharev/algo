package com.visu.algo.search;

import org.junit.Assert;
import org.junit.Test;

import static com.visu.algo.search.TestData.ELEMENTS_EVEN;
import static com.visu.algo.search.TestData.ELEMENTS_ODD;
import static com.visu.algo.search.TestData.ELEMENT_NOT_FOUND;

public class BinarySearcherTest {

    private final Searcher searcher = new BinarySearcher();

    @Test
    public void binarySearch() throws Exception {
        Assert.assertEquals(6, searcher.search(ELEMENTS_EVEN, 7));
    }

    @Test
    public void binarySearchFirst() throws Exception {
        Assert.assertEquals(0, searcher.search(ELEMENTS_EVEN, 1));
    }

    @Test
    public void binarySearchLast() throws Exception {
        Assert.assertEquals(9, searcher.search(ELEMENTS_EVEN, 10));
    }

    @Test
    public void binarySearchNotFoundMiddle() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 5.5));
    }

    @Test
    public void binarySearchNotFoundBefore() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 11));
    }

    @Test
    public void binarySearchNotFoundAfter() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 0));
    }

    @Test
    public void linearSearchOddNumber() throws Exception {
        Assert.assertEquals(1, searcher.search(ELEMENTS_ODD, 2));
    }
}
