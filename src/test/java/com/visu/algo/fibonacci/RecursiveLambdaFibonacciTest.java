package com.visu.algo.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class RecursiveLambdaFibonacciTest {
    @Test
    public void testGetValue() throws Exception {
        RecursiveLambdaFibonacci fibonacci = new RecursiveLambdaFibonacci();
        int value = fibonacci.getValue(10);
        Assert.assertEquals(34, value);
    }
}
