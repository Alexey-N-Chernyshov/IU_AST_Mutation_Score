package java.org.joda.time.field;

import org.joda.time.DurationFieldType;

import org.joda.time.chrono.IslamicChronology;
import org.joda.time.field.DelegatedDurationField;

public class DriveDelegateDurationField {

    static private DelegatedDurationField ddf = (DelegatedDurationField) DurationFieldType.seconds().getField(IslamicChronology.getInstance());

    static void getName() {
        ddf.getName();
    }

    static void getType() {
        ddf.getType();
    }

    static void add(Long instant, int value)
    {
        ddf.add(instant, value);
    }

    static void add2(Long instant, Long value)
    {
        ddf.add(instant,value);
    }

    public static void main(String[] args) {
        getName();
        getType();
        add(1L, 2);
        add2(1L,2L);

    }


}
