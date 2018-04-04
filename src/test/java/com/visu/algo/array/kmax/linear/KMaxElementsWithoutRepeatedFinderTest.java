package com.visu.algo.array.kmax.linear;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class KMaxElementsWithoutRepeatedFinderTest {

    @Test
    public void find() {
        KMaxElementsWithoutRepeatedFinder finder = new KMaxElementsWithoutRepeatedFinder();
        List<Integer> max = finder.find(Arrays.asList(11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11), 10);
        Assert.assertEquals(Arrays.asList(11, 10, 9, 8, 7, 6, 5, 4, 3, 2), max);
    }
}