/*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import java.math.RoundingMode;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 *
 * @author Brian S O'Neill
 */
public class TestFieldUtils extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestFieldUtils.class);
    }

    public TestFieldUtils(String name) {
        super(name);
    }

    public void testSafeAddInt() {
        assertEquals(0, FieldUtils.safeAdd(0, 0));

        assertEquals(5, FieldUtils.safeAdd(2, 3));
        assertEquals(-1, FieldUtils.safeAdd(2, -3));
        assertEquals(1, FieldUtils.safeAdd(-2, 3));
        assertEquals(-5, FieldUtils.safeAdd(-2, -3));

        assertEquals(Integer.MAX_VALUE - 1, FieldUtils.safeAdd(Integer.MAX_VALUE, -1));
        assertEquals(Integer.MIN_VALUE + 1, FieldUtils.safeAdd(Integer.MIN_VALUE, 1));

        assertEquals(-1, FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MAX_VALUE));
        assertEquals(-1, FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MIN_VALUE));

        try {
            FieldUtils.safeAdd(Integer.MAX_VALUE, 1);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Integer.MAX_VALUE, 100);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Integer.MAX_VALUE, Integer.MAX_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Integer.MIN_VALUE, -1);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Integer.MIN_VALUE, -100);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Integer.MIN_VALUE, Integer.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    public void testSafeAddLong() {
        assertEquals(0L, FieldUtils.safeAdd(0L, 0L));

        assertEquals(5L, FieldUtils.safeAdd(2L, 3L));
        assertEquals(-1L, FieldUtils.safeAdd(2L, -3L));
        assertEquals(1L, FieldUtils.safeAdd(-2L, 3L));
        assertEquals(-5L, FieldUtils.safeAdd(-2L, -3L));

        assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeAdd(Long.MAX_VALUE, -1L));
        assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeAdd(Long.MIN_VALUE, 1L));

        assertEquals(-1, FieldUtils.safeAdd(Long.MIN_VALUE, Long.MAX_VALUE));
        assertEquals(-1, FieldUtils.safeAdd(Long.MAX_VALUE, Long.MIN_VALUE));

        try {
            FieldUtils.safeAdd(Long.MAX_VALUE, 1L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Long.MAX_VALUE, 100L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Long.MAX_VALUE, Long.MAX_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Long.MIN_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Long.MIN_VALUE, -100L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeAdd(Long.MIN_VALUE, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    public void testSafeSubtractLong() {
        assertEquals(0L, FieldUtils.safeSubtract(0L, 0L));

        assertEquals(-1L, FieldUtils.safeSubtract(2L, 3L));
        assertEquals(5L, FieldUtils.safeSubtract(2L, -3L));
        assertEquals(-5L, FieldUtils.safeSubtract(-2L, 3L));
        assertEquals(1L, FieldUtils.safeSubtract(-2L, -3L));

        assertEquals(Long.MAX_VALUE - 1, FieldUtils.safeSubtract(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE + 1, FieldUtils.safeSubtract(Long.MIN_VALUE, -1L));

        assertEquals(0, FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MIN_VALUE));
        assertEquals(0, FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MAX_VALUE));

        try {
            FieldUtils.safeSubtract(Long.MIN_VALUE, 1L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeSubtract(Long.MIN_VALUE, 100L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeSubtract(Long.MIN_VALUE, Long.MAX_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeSubtract(Long.MAX_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeSubtract(Long.MAX_VALUE, -100L);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeSubtract(Long.MAX_VALUE, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    //-----------------------------------------------------------------------
    public void testSafeMultiplyLongLong() {
        assertEquals(0L, FieldUtils.safeMultiply(0L, 0L));
        
        assertEquals(1L, FieldUtils.safeMultiply(1L, 1L));
        assertEquals(3L, FieldUtils.safeMultiply(1L, 3L));
        assertEquals(3L, FieldUtils.safeMultiply(3L, 1L));
        
        assertEquals(6L, FieldUtils.safeMultiply(2L, 3L));
        assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L));
        assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L));
        assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L));
        
        assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L));
        assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L));


        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeMultiply(-1L, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
      
        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, 100L);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeMultiply(Long.MAX_VALUE, Long.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    //-----------------------------------------------------------------------
    public void testSafeMultiplyLongInt() {
        assertEquals(0L, FieldUtils.safeMultiply(0L, 0));
        
        assertEquals(1L, FieldUtils.safeMultiply(1L, 1));
        assertEquals(3L, FieldUtils.safeMultiply(1L, 3));
        assertEquals(3L, FieldUtils.safeMultiply(3L, 1));
        
        assertEquals(6L, FieldUtils.safeMultiply(2L, 3));
        assertEquals(-6L, FieldUtils.safeMultiply(2L, -3));
        assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3));
        assertEquals(6L, FieldUtils.safeMultiply(-2L, -3));
        
        assertEquals(-1L * Integer.MIN_VALUE, FieldUtils.safeMultiply(-1L, Integer.MIN_VALUE));
        
        assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1));
        assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1));

        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, -1);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, 100);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeMultiply(Long.MIN_VALUE, Integer.MAX_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeMultiply(Long.MAX_VALUE, Integer.MIN_VALUE);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testSafeToInt1(){
        long value = -9223372036854775808L;
        try {
            FieldUtils.safeToInt(value);
        } catch (ArithmeticException e) {
            assertEquals("Value cannot fit in an int: " + value,e.getMessage());
        }
    }

    public void testSafeToInt2(){
        long value = 2147483648L;
        try {
            FieldUtils.safeToInt(value);
        } catch (ArithmeticException e) {
            assertEquals("Value cannot fit in an int: " + value,e.getMessage());
        }
    }

    public void testSafeToInt3(){
        assertEquals(1, FieldUtils.safeToInt(1L));
    }


    //-----------------------------------------------------------------------
    public void testSafeMultiplyLongLong1(){
        assertEquals(16777216, FieldUtils.safeMultiply(8388608L, 2L));
    }

    public void testSafeMultiplyLongLong2(){
        long val1 = -1L;
        long val2 = -9223372036854775808L;
        try {
            FieldUtils.safeMultiply(val1, val2);
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Multiplication overflows a long: " + val1 + " * " + val2,e.getMessage());
        }
    }

    public void testSafeMultiplyLongLong3(){
        long val1 = -72057594037927937L;
        long val2 = -9223372036854775808L;
        try {
            FieldUtils.safeMultiply(val1, val2);
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Multiplication overflows a long: " + val1 + " * " + val2,e.getMessage());
        }
    }

    public void testSafeMultiplyLongLong4(){
        assertEquals(0L, FieldUtils.safeMultiply(0L, 2L));
    }

    public void testSafeMultiplyLongLong5(){
        assertEquals(2L, FieldUtils.safeMultiply(2L, 1L));
    }

    public void testSafeMultiplyLongLong6(){
        assertEquals(0L, FieldUtils.safeMultiply(1L, 0L));
    }

    //-----------------------------------------------------------------------
    public void testSafeMultiplyIntInt1() {
        int val1 = 1768918368;
        int val2 = -1298354176;
        try {
            FieldUtils.safeMultiply(val1, val2);
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Multiplication overflows an int: " + val1 + " * " + val2,e.getMessage());
        }
    }
    public void testSafeMultiplyIntInt2() {
        int val1 = 1036538985;
        int val2 = 683873976;
        try {
            FieldUtils.safeMultiply(val1, val2);
            fail();
        } catch (ArithmeticException e) {
            assertEquals("Multiplication overflows an int: " + val1 + " * " + val2,e.getMessage());
        }
    }
    public void testSafeMultiplyIntInt3() {
        assertEquals(2, FieldUtils.safeMultiply(1, 2));
    }

    public void testSafeMultiplyIntInt4() {
        int val1 = 1;
        int val2 = Integer.MIN_VALUE;
        assertEquals(Integer.MIN_VALUE, FieldUtils.safeMultiply(val1, val2));
    }

    public void testSafeMultiplyIntInt5() {
        int val1 = 1;
        int val2 = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE, FieldUtils.safeMultiply(val1, val2));
    }

    //-----------------------------------------------------------------------
    public void testSafeMultiplyToInt1() {
        assertEquals(0, FieldUtils.safeMultiplyToInt(-9223372034707292160L, 0L));
    }

    public void testSafeMultiplyToInt2() {
        try {
            FieldUtils.safeMultiplyToInt(-9223372034707292160L, 2L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt3() {
        try {
            FieldUtils.safeMultiplyToInt(17179869184L, -536870910L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt4() {
        try {
            FieldUtils.safeMultiplyToInt(17179869184L, 67108880L);
        fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt5() {
        assertEquals(1073741824, FieldUtils.safeMultiplyToInt(536870912L, 2L));
    }
    public void testSafeMultiplyToInt6() {
        try {
            FieldUtils.safeMultiplyToInt(-1L, -9223372036854775808L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt7() {
        assertEquals(0, FieldUtils.safeMultiplyToInt(0L, -9223372036854775808L));
    }
    public void testSafeMultiplyToInt8() {
        try {
            FieldUtils.safeMultiplyToInt(-9223372034707292160L, 1L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt9() {
        try {
            FieldUtils.safeMultiplyToInt(2147483648L, 1L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt10() {
        assertEquals(2, FieldUtils.safeMultiplyToInt(2L, 1L));
    }
    public void testSafeMultiplyToInt11() {
        try {
            FieldUtils.safeMultiplyToInt(1L, -9223372036854775808L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt12() {
        try {
            FieldUtils.safeMultiplyToInt(1L, 2147483648L);
            fail();
        } catch (ArithmeticException e) {
        }
    }
    public void testSafeMultiplyToInt13() {
        assertEquals(0, FieldUtils.safeMultiplyToInt(1L, 0L));
    }
    //-----------------------------------------------------------------------
    public void testgetWrappedValue1() {
        assertEquals(1073743748, FieldUtils.getWrappedValue(1073741824, -1073741824,1073742785));
    }
    public void testgetWrappedValue2() {
        assertEquals(939391829, FieldUtils.getWrappedValue(939391829, 899506991,941491030));
    }
    public void testgetWrappedValue3() {
        assertEquals(2, FieldUtils.getWrappedValue(0, 1,2));
    }
    public void testgetWrappedValue4() {
        try {
            FieldUtils.getWrappedValue(0, 0,-2147483646);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("MIN > MAX",e.getMessage());
        }
    }
    public void testgetWrappedValue5() {
        int minVal = 1;
        int maxVal = 1;
        int value = 15;
        try {
            FieldUtils.getWrappedValue(value, minVal,maxVal);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("MIN > MAX",e.getMessage());
        }
    }

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    public void testSafeDivideLongLong() {
        assertEquals(1L, FieldUtils.safeDivide(1L, 1L));
        
        assertEquals(1L, FieldUtils.safeDivide(3L, 3L));
        assertEquals(0L, FieldUtils.safeDivide(1L, 3L));
        assertEquals(3L, FieldUtils.safeDivide(3L, 1L));
        
        assertEquals(1L, FieldUtils.safeDivide(5L, 3L));
        assertEquals(-1L, FieldUtils.safeDivide(5L, -3L));
        assertEquals(-1L, FieldUtils.safeDivide(-5L, 3L));
        assertEquals(1L, FieldUtils.safeDivide(-5L, -3L));
        
        assertEquals(2L, FieldUtils.safeDivide(6L, 3L));
        assertEquals(-2L, FieldUtils.safeDivide(6L, -3L));
        assertEquals(-2L, FieldUtils.safeDivide(-6L, 3L));
        assertEquals(2L, FieldUtils.safeDivide(-6L, -3L));
        
        assertEquals(2L, FieldUtils.safeDivide(7L, 3L));
        assertEquals(-2L, FieldUtils.safeDivide(7L, -3L));
        assertEquals(-2L, FieldUtils.safeDivide(-7L, 3L));
        assertEquals(2L, FieldUtils.safeDivide(-7L, -3L));
        
        assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L));
        assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L));
        
        try {
            FieldUtils.safeDivide(Long.MIN_VALUE, -1L);
            fail();
        } catch (ArithmeticException e) {
        }
        
        try {
            FieldUtils.safeDivide(1L, 0L);
            fail();
        } catch (ArithmeticException e) {
        }
    }

    //-----------------------------------------------------------------------
    public void testSafeDivideRoundingModeLong() {
        assertEquals(3L, FieldUtils.safeDivide(15L, 5L, RoundingMode.UNNECESSARY));
        assertEquals(59L, FieldUtils.safeDivide(179L, 3L, RoundingMode.FLOOR));
        assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.CEILING));
        assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.HALF_UP));
        assertEquals(-60L, FieldUtils.safeDivide(-179L, 3L, RoundingMode.HALF_UP));
        assertEquals(60L, FieldUtils.safeDivide(179L, 3L, RoundingMode.HALF_DOWN));
        assertEquals(-60L, FieldUtils.safeDivide(-179L, 3L, RoundingMode.HALF_DOWN));

        assertEquals(Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, 1L, RoundingMode.UNNECESSARY));
        assertEquals(Long.MIN_VALUE, FieldUtils.safeDivide(Long.MIN_VALUE, 1L, RoundingMode.UNNECESSARY));
        assertEquals(-Long.MAX_VALUE, FieldUtils.safeDivide(Long.MAX_VALUE, -1L, RoundingMode.UNNECESSARY));

        try {
            FieldUtils.safeDivide(Long.MIN_VALUE, -1L, RoundingMode.UNNECESSARY);
            fail();
        } catch (ArithmeticException e) {
        }

        try {
            FieldUtils.safeDivide(1L, 0L, RoundingMode.UNNECESSARY);
            fail();
        } catch (ArithmeticException e) {
        }

    }

}
