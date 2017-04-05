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

    static void addWrapField(long instant, int amount) {

        rdtf.addWrapField(instant, amount);
    }


    static void roundFloor(long instant){rdtf.roundFloor(instant);}

    public static void main(String[] args) {
        add(1L, 2);
        add2(1L, 2L);
        addWrapField(1L,2);
        roundFloor(1L);
    }


}
