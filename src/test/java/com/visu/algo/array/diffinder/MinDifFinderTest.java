package com.visu.algo.array.diffinder;

import org.junit.Assert;
import org.junit.Test;

public class MinDifFinderTest {

    private final MinDifFinder finder = new MinDifFinder();

    @Test
    public void find() {
        Assert.assertEquals(1, finder.find(new int[] {0, 7, 10, 6}, new int[] {15, 8, 3}));
    }

    @Test
    public void find_fromSingle() {
        Assert.assertEquals(10, finder.find(new int[] {1}, new int[] {11}));
    }

    @Test
    public void find_notOverlap() {
        Assert.assertEquals(2, finder.find(new int[] {1, 2, 4}, new int[] {6, 7, 10, 12}));
    }
}