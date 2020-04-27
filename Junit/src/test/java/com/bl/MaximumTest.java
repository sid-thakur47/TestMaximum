package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenThreeInteger_Should_ReturnMaximum() {
        Maximum maximum = new Maximum();
        int max = maximum.findMaximum( 10, 20, 30 );
        Assert.assertEquals( 30, max );
    }
    @Test
    public void givenThreeFloat_Should_ReturnMaximum() {
        Maximum maximum = new Maximum();
        float max = maximum.findMaximum( 10.14f, 20.34f, 30.45f );
        Assert.assertEquals( 30.45f, max, 0.01 );
    }
}
