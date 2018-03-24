package com.visu.algo.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveFibonacciTest {

    @Test
    public void testGetValue() throws Exception {
        RecursiveFibonacci fibonacci = new RecursiveFibonacci();
        int value = fibonacci.getValue(10);
        Assert.assertEquals(34, value);
    }

}
