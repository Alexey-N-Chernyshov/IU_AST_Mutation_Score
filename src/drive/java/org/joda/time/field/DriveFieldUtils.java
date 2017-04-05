package org.joda.time.field;

import org.joda.time.field.FieldUtils;

class DriveFieldUtils { 

    public static void test_safeMultiplyInt(int val1, int val2) {
        FieldUtils.safeMultiply(val1, val2);
    }

    public static void test_safeMultiplyLong(long val1, long val2) {
        FieldUtils.safeMultiply(val1, val2);
    }

    public static void test_safeToInt(long value) {
        FieldUtils.safeToInt(value);
    }

    public static void test_getWrappedValue(int value, int minValue, int maxValue) {
        FieldUtils.getWrappedValue(value, minValue, maxValue);
    }

    public static void test_safeMultiplyToInt(long val1, long val2) {
        FieldUtils.safeMultiplyToInt(val1, val2);
    }


    public static void main(String[] args) {
        test_safeMultiplyInt(1, 2);
        test_safeMultiplyLong(1L, 2L);
	test_safeToInt(1L);
	test_getWrappedValue(1,0,2);
	test_safeMultiplyToInt(1L, 2L);
    }
}
