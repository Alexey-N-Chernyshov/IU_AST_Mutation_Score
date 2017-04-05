package org.joda.time.field;


import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.IslamicChronology;

public class DriveDividedDateTimeField {

    static DividedDateTimeField rdtf = new DividedDateTimeField(
            DateTimeFieldType.dayOfMonth().getField(IslamicChronology.getInstance()),
            null,
            DateTimeFieldType.dayOfMonth(),
            5);

    static void get(Long instant) {
        rdtf.get(instant);
    }

    static void add(Long instant, int value) {
        rdtf.add(instant, value);
    }

    static void add2(Long instant, Long value) {
        rdtf.add(instant, value);
    }

    public static void main(String[] args) {
        get(1L);
        add(1L, 2);
        add2(1L, 2L);
    }


}
