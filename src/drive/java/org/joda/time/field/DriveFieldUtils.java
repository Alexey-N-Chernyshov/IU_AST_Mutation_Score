package java.org.joda.time.field;

import org.joda.time.field.FieldUtils;

class DriveFieldUtils {

    static void test_safeMultiply_int(int val1, int val2) {
        FieldUtils.safeMultiply(val1, val2);
    }

    static void test_safeMultiply_long(long val1, long val2) {
        FieldUtils.safeMultiply(val1, val2);
    }

    static void test_safeToInt(long value) {
        FieldUtils.safeToInt(value);
    }

    static void test_safeMultiplyToInt(long val1, long val2) {
        FieldUtils.safeMultiplyToInt(val1, val2);
    }

    static void test_getWrappedValue(int value, int minValue, int maxValue) {
        FieldUtils.getWrappedValue(value, minValue, maxValue);
    }


    public static void main(String[] args) {
        test_safeMultiply_int(1,1);
        test_safeMultiply_long(1L,1L);
        test_safeToInt(1L);
        test_safeMultiplyToInt(1L,1L);
        test_getWrappedValue(1,0,2);

    }
}
