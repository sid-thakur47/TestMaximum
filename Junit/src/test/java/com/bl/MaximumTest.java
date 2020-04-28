package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum maximum = new Maximum();

    @Test
    public void givenThreeInteger_Should_ReturnMaximum() {

        int max = maximum.findMaximum( 10, 20, 30 );
        Assert.assertEquals( 30, max );
    }
    @Test
    public void givenThreeFloat_Should_ReturnMaximum() {
        float max = maximum.findMaximum( 10.14f, 20.34f, 30.45f );
        Assert.assertEquals( 30.45f, max, 0.01 );
    }
    @Test
    public void givenThreeString_Should_ReturnMaximum() {
        String max = maximum.findMaximum( "xyz", "abc", "ghi" );
        Assert.assertEquals( "xyz", max );
    }
}
