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
	test_appendYearOfCentury(1, 1);
	test_appendCenturyOfEra(1, 1);
	test_appendDayOfYear(1);
	test_appendWeekOfWeekyear(1);
	test_appendWeekyear(1, 1);
	test_appendMonthOfYear(1);
	test_appendYearOfEra(1, 1);
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


    //line 934
    public static void test_appendYearOfCentury(int minDigits, int maxDigits) {
	DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendYearOfCentury(minDigits, maxDigits);
    }

    //line 946
    public static void test_appendCenturyOfEra(int minDigits, int maxDigits) {
	DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendCenturyOfEra(minDigits, maxDigits);
    }
    // line 786
    public static void test_appendDayOfYear(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendDayOfYear(minDigits);
    }

    // line 796
    public static void test_appendWeekOfWeekyear(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendWeekOfWeekyear(minDigits);
    }

    // line 808
    public static void test_appendWeekyear(int minDigits, int maxDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendWeekyear(minDigits, maxDigits);
    }

    // line 818
    public static void test_appendMonthOfYear(int minDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendMonthOfYear(minDigits);
    }

    // line 922
    public static void test_appendYearOfEra(int minDigits, int maxDigits) {
        DateTimeFormatterBuilder tested = new DateTimeFormatterBuilder();
        tested.appendYearOfEra(minDigits, maxDigits);
    }

}
