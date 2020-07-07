/*package com.shumsky.Enum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ClasssTest {
    private Classs classs;

    @Before
    public void setUp() throws Exception {
        classs = new Classs();
    }

    @After
    public void tearDown() throws Exception {
        classs = null;
    }

    @Test
    public void testSum() {
        int actual= classs.sum(2,3);
        int expected= 5;
        assertEquals(actual,expected);
    }

    @Test
    public void testSumPositivCase() {
    }

    @Test
    public void testSub() {
    }

    @Test
    public void testSubNegCase() {
    }

    @Test
    public void testMult() {
    }

    @Test
    public void testDel() {
    }

    @Test(expected = ArithmeticException.class)
    public void testDelByZero() {
        int actualy = classs.del(50,0);
        int expexted = 10;
        assertTrue(actualy==expexted);
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSort(){
        int[]actual = classs.sort(new int[]{2,33,6,2,5});
        int[]expexted = new int[]{2,2,5,6,33};
        assertArrayEquals(actual,expexted);
    }

}*/