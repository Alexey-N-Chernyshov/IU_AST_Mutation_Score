package org.joda.time.format;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestFormatUtils extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestFormatUtils.class);
    }

    public TestFormatUtils(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public void test_calculateDigitCount_1(){
        int tested = FormatUtils.calculateDigitCount(1L);
        assertEquals(1,tested);
    }

    public void test_calculateDigitCount_2(){
        int tested = FormatUtils.calculateDigitCount(4611686018427387904L);
        assertEquals(19,tested);
    }

    public void test_calculateDigitCount_3(){
        int tested = FormatUtils.calculateDigitCount(8192L);
        assertEquals(4,tested);
    }

    public void test_calculateDigitCount_4(){
        int tested = FormatUtils.calculateDigitCount(512L);
        assertEquals(3,tested);
    }

    public void test_calculateDigitCount_5(){
        int tested = FormatUtils.calculateDigitCount(32L);
        assertEquals(2,tested);
    }

    public void test_calculateDigitCount_6(){
        int tested = FormatUtils.calculateDigitCount(-9223372036854775808L);
        assertEquals(20,tested);
    }

    public void test_calculateDigitCount_7(){
        int tested = FormatUtils.calculateDigitCount(-9223372036854775804L);
        assertEquals(20,tested);
    }

    public void test_calculateDigitCount_8(){
        int tested = FormatUtils.calculateDigitCount(-8193L);
        assertEquals(5,tested);
    }

    public void test_calculateDigitCount_9(){
        int tested = FormatUtils.calculateDigitCount(-513L);
        assertEquals(4,tested);
    }

    public void test_calculateDigitCount_10(){
        int tested = FormatUtils.calculateDigitCount(-33L);
        assertEquals(3,tested);
    }

    public void test_calculateDigitCount_11(){
        int tested = FormatUtils.calculateDigitCount(-1L);
        assertEquals(2,tested);
    }
}
