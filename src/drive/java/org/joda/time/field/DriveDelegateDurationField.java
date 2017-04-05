package org.joda.time.field;

import org.joda.time.DurationFieldType;

import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.DelegatedDurationField;

public class DriveDelegateDurationField {

    static void add(Long instant, int value)
    {
        DelegatedDurationField ddf = (DelegatedDurationField) DurationFieldType.seconds()
                .getField(IslamicChronology.getInstance());

        ddf.add(instant, value);
    }

    static void add2(Long instant, Long value)
    {
        DelegatedDurationField ddf = (DelegatedDurationField) DurationFieldType.seconds()
                .getField(IslamicChronology.getInstance());
        ddf.add(instant,value);
    }

    public static void main(String[] args) {
        add(1L, 2);
        add2(1L,2L);
    }


}
