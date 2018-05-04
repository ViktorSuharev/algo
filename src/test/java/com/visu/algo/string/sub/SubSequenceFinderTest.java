package com.visu.algo.string.sub;

import org.junit.Assert;
import org.junit.Test;

public class SubSequenceFinderTest {

    private final SubSequenceFinder finder = new MultisetSubSequence();

    @Test
    public void testFind_first() {
        Assert.assertEquals(0, finder.find("aabcdaabd", "aba"));
    }

    @Test
    public void testFind_middle() {
        Assert.assertEquals(3, finder.find("bcdaabd", "aba"));
    }

    @Test
    public void testFind_last() {
        Assert.assertEquals(3, finder.find("bcdaab", "aba"));
    }

    @Test
    public void testFind_fullReset() {
        Assert.assertEquals(4, finder.find("abcdaab", "aba"));
    }

    @Test
    public void testFind_partialReset() {
        Assert.assertEquals(3, finder.find("abbabaacdaab", "aba"));
    }

    @Test
    public void testFind_notFound() {
        Assert.assertEquals(-1, finder.find("bcdacabd", "aba"));
    }
}