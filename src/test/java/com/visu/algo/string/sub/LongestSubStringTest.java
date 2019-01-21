package com.visu.algo.string.sub;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubStringTest {

    private final LongestSubString obj = new LongestSubString();

    @Test
    public void test() {
        Assert.assertEquals(3, obj.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, obj.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, obj.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(1, obj.lengthOfLongestSubstring(" "));
        Assert.assertEquals(2, obj.lengthOfLongestSubstring("aab"));
        Assert.assertEquals(3, obj.lengthOfLongestSubstring("dvdf"));
        Assert.assertEquals(6, obj.lengthOfLongestSubstring("ohvhjdml"));
    }
}
