package org.joda.time.field;

import org.joda.time.field.FieldUtils;

class DriveFieldUtils { 

    public static void test_safeMultiplyInt(int val1, int val2) {
        FieldUtils.safeMultiply(val1, val2);
    }


    public static void main(String[] args) {
        test_safeMultiplyInt(1, 2);
    }
}
