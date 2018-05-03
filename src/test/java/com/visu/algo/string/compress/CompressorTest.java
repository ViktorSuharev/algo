package com.visu.algo.string.compress;

import org.junit.Assert;
import org.junit.Test;

public class CompressorTest {

    private final Compressor compressor = new Compressor();

    @Test
    public void compress() throws Exception {
        Assert.assertEquals("a4bc2", compressor.compress("aaaabcc"));
    }

    @Test
    public void compress_empty() throws Exception {
        Assert.assertEquals("", compressor.compress(""));
    }

    @Test
    public void compress_single() throws Exception {
        Assert.assertEquals("a", compressor.compress("a"));
    }

    @Test
    public void compress_mono() throws Exception {
        Assert.assertEquals("a7", compressor.compress("aaaaaaa"));
    }

    @Test
    public void compress_unique() throws Exception {
        Assert.assertEquals("abcdefg", compressor.compress("abcdefg"));
    }

    @Test
    public void compress_firstRepeated() throws Exception {
        Assert.assertEquals("a3defg", compressor.compress("aaadefg"));
    }

    @Test
    public void compress_lastRepeated() throws Exception {
        Assert.assertEquals("abcdg3", compressor.compress("abcdggg"));
    }
}
