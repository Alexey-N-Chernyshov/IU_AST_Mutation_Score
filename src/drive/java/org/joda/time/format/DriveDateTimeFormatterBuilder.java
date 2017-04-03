package org.joda.time.format;

import org.joda.time.format.DateTimeFormatterBuilder;

class DriveDateTimeFormatterBuilder { 

    // line 615
    static void test_appendFractionOfMinute(int minDigits, int maxDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendFractionOfMinute(minDigits, maxDigits);
    }

    public static void main(String[] args) {
        test_appendFractionOfMinute(1, 2);
        test_appendFractionOfHour(1, 2);
        test_appendFractionOfDay(1, 2);
        test_appendMillisOfSecond(1);
        test_appendMillisOfDay(1);
        test_appendSecondOfMinute(1);
        test_appendMinuteOfHour(1);
        test_appendMinuteOfDay(1);
        test_appendHourOfDay(1);
        test_appendClockhourOfDay(1);
        test_appendHourOfHalfday(1);
        test_appendDayOfWeek(1);
    }

    // line 632
    public static void test_appendFractionOfHour(int minDigits, int maxDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendFractionOfHour(minDigits, maxDigits);
    }

    // line 649
    public static void test_appendFractionOfDay(int minDigits, int maxDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendFractionOfDay(minDigits, maxDigits);
    }

    // line 666
    public static void test_appendMillisOfSecond(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendMillisOfSecond(minDigits);
    }

    // line 676
    public static void test_appendMillisOfDay(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendMillisOfDay(minDigits);
    }

    // line 686
    public static void test_appendSecondOfMinute(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendSecondOfMinute(minDigits);
    }

    // line 706
    public static void test_appendMinuteOfHour(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendMinuteOfHour(minDigits);
    }

    // line 716
    public static void test_appendMinuteOfDay(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendMinuteOfDay(minDigits);
    }

    // line 726
    public static void test_appendHourOfDay(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendHourOfDay(minDigits);
    }

    // line 736
    public static void test_appendClockhourOfDay(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendClockhourOfDay(minDigits);
    }

    // line 746
    public static void test_appendHourOfHalfday(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendHourOfHalfday(minDigits);
    }

    // line 766
    public static void test_appendDayOfWeek(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendDayOfWeek(minDigits);
    }

}
