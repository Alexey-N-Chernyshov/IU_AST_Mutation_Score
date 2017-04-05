package org.joda.time.format;

import org.joda.time.format.FormatUtils;

class DriveFormatUtils { 

    static void test_calculateDigitCount(long value) {
        FormatUtils.calculateDigitCount(value);
    }

    static void test_createErrorMessage(String text, int errorPos) {
        FormatUtils.createErrorMessage(text, errorPos);
    }

    public static void main(String[] args) {
        test_calculateDigitCount(1L);
        test_createErrorMessage("str", 0);
    }
}
