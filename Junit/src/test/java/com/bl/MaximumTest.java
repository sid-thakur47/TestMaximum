package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenThreeInteger_Should_ReturnMaximum() {

        int max = ExtendedMaximum.findMaximum( 10, 20, 30 );
        Assert.assertEquals( 30, max );
    }
    @Test
    public void givenThreeFloat_Should_ReturnMaximum() {
        float max = ExtendedMaximum.findMaximum( 10.14f, 20.34f, 30.45f );
        Assert.assertEquals( 30.45f, max, 0.01 );
    }
    @Test
    public void givenThreeString_Should_ReturnMaximum() {
        String max = ExtendedMaximum.findMaximum( "xyz", "abc", "ghi" );
        Assert.assertEquals( "xyz", max );
    }
    @Test
    public void givenThreeIntegersInConstructor_Should_ReturnMaximum() {
        int maxInt = new ExtendedMaximum<>( 10, 20, 30 ).testMaximum();
        Assert.assertEquals( 30, maxInt );
    }

    @Test
    public void givenThreeIntegersInVariableConstructor_Should_ReturnMaximum() {
        int maxInt = new ExtendedMaximum<>( 10, 20, 30, 40 ).testMaximum();
        Assert.assertEquals( 40, maxInt );
    }
    @Test
    public void givenThreeFloatsInConstructor_Should_ReturnMaximum() {
        float maxFloat = new ExtendedMaximum<>( 10.4f, 20.34f, 30.45f ).testMaximum();
        Assert.assertEquals( 30.45f, maxFloat, 0.01 );
    }

    @Test
    public void givenThreeFloatsInVariableConstructor_Should_ReturnMaximum() {
        float maxFloat = new ExtendedMaximum<>( 10.4f, 20.34f, 30.45f, 50f ).testMaximum();
        Assert.assertEquals( 50.f, maxFloat, 0.01 );
    }

    @Test
    public void givenThreeStringsInConstructor_Should_ReturnMaximum() {
        String maxString = new ExtendedMaximum<>( "xyz", "abc", "def" ).testMaximum();
        Assert.assertEquals( "xyz", maxString );
    }

    @Test
    public void givenThreeStringsInVariableConstructor_Should_ReturnMaximum() {
        String maxString = new ExtendedMaximum<>( "xyz", "abc", "def", "zzz" ).testMaximum();
        Assert.assertEquals( "zzz", maxString );
    }
}