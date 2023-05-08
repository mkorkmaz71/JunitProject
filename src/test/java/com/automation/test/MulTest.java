package com.automation.test;
// 1. a = 10, b = 5,    expected = 50
// 2. a = 4,  b = 0,    expected = 0
// 3. a = 10, b = 10,   expected = 100
// 4. a = -10, b = 5,   expected = -50
// 5. a = -10, b = -5,  expected = 50
// 6. a = 0, b = 0,     expected = 0
// 7. a = 10000, b=2500, expected = 25000000

import com.dev.product.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MulTest {
    Calculator cal;
    @Before
    public  void  setUp(){
        cal=new Calculator();
    }
    @Test
    public void testPositive(){
        int a=10, b=5,expected=50;
        int actual= cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithAnotherZero(){
        int a=4, b=0, expected=0;
        int actual=cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testEqualNumbers(){
        int a=10, b=10,expected=100;
        int actual= cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testOneNegative(){
        int a=-10, b=5,expected=-50;
        int actual= cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTwoNegative(){
        int a=-10, b=-5,expected=50;
        int actual= cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithDoubleZero(){
        int a=0, b=0, expected=0;
        int actual=cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testWithBigNumbers(){
        int a=10000, b=2500, expected=25000000;
        int actual=cal.mul(a,b);
        Assert.assertEquals(expected, actual);
    }
}
