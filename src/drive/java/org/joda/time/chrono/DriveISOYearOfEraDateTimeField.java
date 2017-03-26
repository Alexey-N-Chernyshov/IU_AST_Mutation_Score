package org.joda.time.chrono;

import java.io.*;
import org.joda.time.chrono.ISOYearOfEraDateTimeField;

class DriveISOYearOfEraDateTimeField { 

    static void test_get(long instant) {
        ISOYearOfEraDateTimeField.INSTANCE.get(instant);
    }

    static void test_add(long instant, int years) {
        ISOYearOfEraDateTimeField.INSTANCE.add(instant, years);
    }

    static void test_add2(long instant, long years) {
        ISOYearOfEraDateTimeField.INSTANCE.add(instant, years);
    }

    static void test_addWrapField(long instant, int years) {
        ISOYearOfEraDateTimeField.INSTANCE.addWrapField(instant, years);
    }

    static void test_getDifference(long minuendInstant, long subtrahendInstant) {
        ISOYearOfEraDateTimeField.INSTANCE.getDifference(minuendInstant, subtrahendInstant);
    }

     static void test_getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
        ISOYearOfEraDateTimeField.INSTANCE.getDifferenceAsLong(minuendInstant, subtrahendInstant);
    }

    static void test_set(long instant, int year) {
        ISOYearOfEraDateTimeField.INSTANCE.set(instant, year);
    }

    static void test_roundCeiling(long instant) {
        ISOYearOfEraDateTimeField.INSTANCE.roundCeiling(instant);
    }

    static void test_remainder(long instant) {
        ISOYearOfEraDateTimeField.INSTANCE.remainder(instant);
    }

    public static void main(String[] args) {
        System.out.println("===");
        test_get(1L);
        test_add(1L, 2);
        test_add2(1L, 2L);
        test_addWrapField(1L, 2);
        test_getDifference(1L, 2L);
        test_getDifferenceAsLong(1L, 2L);
        test_set(1L, 2);
        test_roundCeiling(1L);
        test_remainder(1L);
    }

}
