package com.visu.algo.string.inverter;

import org.junit.Assert;
import org.junit.Test;

public class StringRecursiveInverterCharArrayTest {

    private final StringRecursiveInverterCharArray stringRecursiveInverterCharArray = new StringRecursiveInverterCharArray();

    @Test
    public void testInvertSingleSymbol() {
        Assert.assertEquals("a", stringRecursiveInverterCharArray.invert("a"));
    }

    @Test
    public void testInvertTwoSymbols() {
        Assert.assertEquals("ba", stringRecursiveInverterCharArray.invert("ab"));
    }

    @Test
    public void testInvertThreeSymbols() {
        Assert.assertEquals("cba", stringRecursiveInverterCharArray.invert("abc"));
    }

    @Test
    public void testInvertEven() {
        Assert.assertEquals("321cba", stringRecursiveInverterCharArray.invert("abc123"));
    }

    @Test
    public void testInvertOdd() {
        Assert.assertEquals("4321cba", stringRecursiveInverterCharArray.invert("abc1234"));
    }
}
