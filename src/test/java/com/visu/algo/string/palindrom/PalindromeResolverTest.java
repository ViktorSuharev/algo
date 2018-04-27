package com.visu.algo.string.palindrom;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeResolverTest {

    private PalindromeResolver resolver = new PalindromeResolver();

    @Test
    public void isPalindrome() {
        Assert.assertTrue(resolver.isPalindrome("abba"));
        Assert.assertTrue(resolver.isPalindrome("abcba"));
        Assert.assertTrue(resolver.isPalindrome("!a b3 b      a"));
        Assert.assertTrue(resolver.isPalindrome("abra kak arba"));
        Assert.assertTrue(resolver.isPalindrome(""));
        Assert.assertTrue(resolver.isPalindrome("ab|656|ba"));

        Assert.assertFalse(resolver.isPalindrome("absdfsdfba"));
    }
}