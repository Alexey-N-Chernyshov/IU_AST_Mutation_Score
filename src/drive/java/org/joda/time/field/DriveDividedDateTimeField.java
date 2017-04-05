package org.joda.time.field;


import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.IslamicChronology;

public class DriveDividedDateTimeField {

    static DividedDateTimeField rdtf = new DividedDateTimeField(
            DateTimeFieldType.dayOfMonth().getField(IslamicChronology.getInstance()),
            null,
            DateTimeFieldType.dayOfMonth(),
            5);


    static void add(long instant, int value) {
        rdtf.add(instant, value);
    }

    static void add2(long instant, long value) {
        rdtf.add(instant, value);
    }

    static void set(long instant, int value) {
        rdtf.set(instant, value);
    }

    static void addWrapField(long instant, int amount) {

        rdtf.addWrapField(instant, amount);
    }

    static void getDifference(long minuendInstant, long subtrahendInstant) {
            rdtf.getDifference(minuendInstant,subtrahendInstant);
    }

    static void getDifferenceAsLong(long minuendInstant, long subtrahendInstant){
            rdtf.getDifferenceAsLong(minuendInstant,subtrahendInstant);
    }

    static void remainder(long instant){
        rdtf.remainder(instant);
    }

    public static void main(String[] args) {
        add(1L, 2);
        add2(1L, 2L);
        set(1L,2);
        addWrapField(1L,2);
        remainder(1L);
        getDifferenceAsLong(1L,1L);
        getDifferenceAsLong(1L,1L);

    }


}
