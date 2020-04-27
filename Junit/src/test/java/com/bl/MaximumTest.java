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
}
