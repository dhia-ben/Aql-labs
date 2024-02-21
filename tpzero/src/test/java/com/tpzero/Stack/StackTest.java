package com.tpzero.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPush() {
        stack.push(1);
        Assert.assertEquals(1, stack.size());
    }

    @Test
    public void testPushWithExpendElement() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);

        Assert.assertEquals(11, stack.size());
    }

}