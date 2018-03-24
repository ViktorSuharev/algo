package com.visu.algo.fibonacci;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicFibonacciTest {

    private static final List EXPECTED_SEQUENCE = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);

    private Fibonacci fibonacci = new DynamicFibonacci();

    @Test
    public void getValue() throws Exception {
        int result = fibonacci.getValue(10);
        Assert.assertEquals(34, result);
    }

    @Test
    public void generate() throws Exception {
        List<Integer> result = fibonacci.getSequence(10);
        Assert.assertEquals(EXPECTED_SEQUENCE, result);
    }

}
