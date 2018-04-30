package com.visu.algo.structure.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack stack = new Stack();

    @Before
    public void setUp() {
        stack.clear();
    }

    @Test
    public void testPush() {
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        Assert.assertSame(4, stack.size());

        stack.push(6);
        Assert.assertSame(5, stack.size());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(2);

        Assert.assertSame(2, stack.pop());
        Assert.assertSame(3, stack.pop());
        Assert.assertSame(4, stack.pop());
        Assert.assertSame(1, stack.pop());
    }

    @Test
    public void testMax() {
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(5);

        Assert.assertSame(5, stack.max());
        Assert.assertSame(5, stack.pop());
    }

    @Test
    public void testClear() {
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(5);

        stack.clear();

        Assert.assertNull(stack.pop());
        Assert.assertNull(stack.max());
    }

    @Test
    public void testSize() {
        stack.push(1);
        stack.push(4);
        stack.push(3);
        stack.push(5);

        Assert.assertSame(4, stack.size());
    }
}