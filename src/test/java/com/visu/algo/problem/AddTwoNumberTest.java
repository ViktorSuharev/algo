package com.visu.algo.problem;

import com.visu.algo.problem.addtwonums.AddTwoNumber;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumberTest {

    private final AddTwoNumber adder = new AddTwoNumber();

    @Test
    public void add() {
        Assert.assertArrayEquals(new int[] {0, 2, 5}, adder.add(new int[] {1, 0, 1}, new int[] {9, 1, 4}));
    }

    @Test
    public void add_overflow() {
        Assert.assertArrayEquals(new int[] {0, 2, 5, 1}, adder.add(new int[] {1, 0, 9}, new int[] {9, 1, 6}));
    }
}