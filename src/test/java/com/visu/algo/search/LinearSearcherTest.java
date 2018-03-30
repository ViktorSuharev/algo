package com.visu.algo.search;

import org.junit.Assert;
import org.junit.Test;

import static com.visu.algo.search.TestData.ELEMENTS_ODD;
import static com.visu.algo.search.TestData.ELEMENT_NOT_FOUND;
import static com.visu.algo.search.TestData.ELEMENTS_EVEN;

public class LinearSearcherTest {

    private final Searcher searcher = new BinarySearcher();

    @Test
    public void linearSearch() throws Exception {
        Assert.assertEquals(6, searcher.search(ELEMENTS_EVEN, 7));
    }

    @Test
    public void linearSearchFirst() throws Exception {
        Assert.assertEquals(0, searcher.search(ELEMENTS_EVEN, 1));
    }

    @Test
    public void linearSearchLast() throws Exception {
        Assert.assertEquals(9, searcher.search(ELEMENTS_EVEN, 10));
    }

    @Test
    public void linearSearchNotFoundMiddle() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 5.5));
    }

    @Test
    public void linearSearchNotFoundBefore() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 11));
    }

    @Test
    public void linearSearchNotFoundAfter() throws Exception {
        Assert.assertEquals(ELEMENT_NOT_FOUND, searcher.search(ELEMENTS_EVEN, 0));
    }

    @Test
    public void linearSearchOddNumber() throws Exception {
        Assert.assertEquals(1, searcher.search(ELEMENTS_ODD, 2));
    }
}