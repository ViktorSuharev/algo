package com.visu.algo.string.inverter;

import org.junit.Assert;
import org.junit.Test;

public class StringRecursiveInverterTest {

    private final StringRecursiveInverter stringRecursiveInverter = new StringRecursiveInverter();

    @Test
    public void testInvertSingleSymbol() {
        Assert.assertEquals("a", stringRecursiveInverter.invert("a"));
    }

    @Test
    public void testInvertTwoSymbols() {
        Assert.assertEquals("ba", stringRecursiveInverter.invert("ab"));
    }

    @Test
    public void testInvertThreeSymbols() {
        Assert.assertEquals("cba", stringRecursiveInverter.invert("abc"));
    }

    @Test
    public void testInvertEven() {
        Assert.assertEquals("321cba", stringRecursiveInverter.invert("abc123"));
    }

    @Test
    public void testInvertOdd() {
        Assert.assertEquals("4321cba", stringRecursiveInverter.invert("abc1234"));
    }
}