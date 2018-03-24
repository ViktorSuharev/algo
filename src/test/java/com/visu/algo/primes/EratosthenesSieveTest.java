package com.visu.algo.primes;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EratosthenesSieveTest {

    List<Integer> EXPECTED
            = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);

    @Test
    public void testGetValues() throws Exception {
        EratosthenesSieve sieve = new EratosthenesSieve();
        Assert.assertEquals(EXPECTED, sieve.getValues(100));
    }
}
