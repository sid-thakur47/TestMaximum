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
    @Test//normal integer
    public void givenThreeIntegersInConstructor_Should_ReturnMaximum() {
        int maxInt = new Maximum<>( 10, 20, 30 ).testMaximum();
        Assert.assertEquals( 30, maxInt );
    }

    @Test//extebded integer
    public void givenThreeIntegersInVariableConstructor_Should_ReturnMaximum() {
        int maxInt = new ExtendedMaximum<>( 10, 20, 30, 40 ).testMaximum();
        Assert.assertEquals( 40, maxInt );
    }
    @Test//normal float
    public void givenThreeFloatsInConstructor_Should_ReturnMaximum() {
        float maxfloat = new Maximum<Float>( 10.4f, 20.34f, 30.45f ).testMaximum();
        Assert.assertEquals( 30.45f, maxfloat, 0.01 );
    }

    @Test//extended float
    public void givenThreeFloatsInVariableConstructor_Should_ReturnMaximum() {
        float maxfloat = new ExtendedMaximum<>( 10.4f, 20.34f, 30.45f, 50f ).testMaximum();
        Assert.assertEquals( 50.f, maxfloat, 0.01 );
    }

    @Test//normal string
    public void givenThreeStringsInConstructor_Should_ReturnMaximum() {
        String maxString = new Maximum<>( "xyz", "abc", "def" ).testMaximum();
        Assert.assertEquals( "xyz", maxString );
    }

    @Test//extended string
    public void givenThreeStringsInVariableConstructor_Should_ReturnMaximum() {
        String maxString = new ExtendedMaximum<>( "xyz", "abc", "def", "zzz" ).testMaximum();
        Assert.assertEquals( "zzz", maxString );
    }
}