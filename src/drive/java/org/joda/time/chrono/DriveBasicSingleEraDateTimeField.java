package org.joda.time.chrono;

import org.joda.time.chrono.BasicSingleEraDateTimeField;

class DriveBasicSingleEraDateTimeField { 

    static void testIsLenient() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        tested.isLenient();
    }

    static void testSet(long instant, int era) {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        tested.set(instant, era);
    }

    public static void main(String[] args) {
        testIsLenient();
        testSet(1, 2);
    }
}
