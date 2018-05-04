package com.visu.algo.string.compress;

import org.junit.Assert;
import org.junit.Test;

public class IntCompressorTest {

    private final IntCompressor compressor = new IntCompressor();

    @Test
    public void compress() {
        Assert.assertEquals("1-2,4,6,8-10", compressor.compress(new int[] {1, 2, 4, 6, 8, 9, 10}));
    }

    @Test
    public void compress_empty() {
        Assert.assertEquals("", compressor.compress(new int[] {}));
    }

    @Test
    public void compress_allSingle() {
        Assert.assertEquals("1,4,6,8,10", compressor.compress(new int[] {1, 4, 6, 8, 10}));
    }

    @Test
    public void compress_allSequence() {
        Assert.assertEquals("1-2,4-8", compressor.compress(new int[] {1, 2, 4, 5, 6, 7, 8}));
    }
}