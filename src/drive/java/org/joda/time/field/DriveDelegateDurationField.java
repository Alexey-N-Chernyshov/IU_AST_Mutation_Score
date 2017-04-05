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

    public static void main(String[] args) {
        getName();
        getType();

    }


}
