package com.visu.algo.string.compress;

import org.junit.Assert;
import org.junit.Test;

public class CharCompressorTest {

    private final CharCompressor charCompressor = new CharCompressor();

    @Test
    public void compress() throws Exception {
        Assert.assertEquals("a4bc2", charCompressor.compress("aaaabcc"));
    }

    @Test
    public void compress_empty() throws Exception {
        Assert.assertEquals("", charCompressor.compress(""));
    }

    @Test
    public void compress_single() throws Exception {
        Assert.assertEquals("a", charCompressor.compress("a"));
    }

    @Test
    public void compress_mono() throws Exception {
        Assert.assertEquals("a7", charCompressor.compress("aaaaaaa"));
    }

    @Test
    public void compress_unique() throws Exception {
        Assert.assertEquals("abcdefg", charCompressor.compress("abcdefg"));
    }

    @Test
    public void compress_firstRepeated() throws Exception {
        Assert.assertEquals("a3defg", charCompressor.compress("aaadefg"));
    }

    @Test
    public void compress_lastRepeated() throws Exception {
        Assert.assertEquals("abcdg3", charCompressor.compress("abcdggg"));
    }
}
