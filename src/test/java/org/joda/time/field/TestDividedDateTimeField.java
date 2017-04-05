package org.joda.time.field;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.joda.time.DateTimeFieldType;
import org.joda.time.chrono.IslamicChronology;


public class TestDividedDateTimeField extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDividedDateTimeField.class);
    }

    public TestDividedDateTimeField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public void test_add() {
        DividedDateTimeField rdtf = new DividedDateTimeField(
                DateTimeFieldType.dayOfMonth().getField(IslamicChronology.getInstance()),
                null,
                DateTimeFieldType.dayOfMonth(),
                5);

        assertEquals(162619796516314920L,rdtf.add(-26100246702080L,-1341491787));

    }

    public void test_add2() {
        DividedDateTimeField rdtf = new DividedDateTimeField(
                DateTimeFieldType.dayOfMonth().getField(IslamicChronology.getInstance()),
                null,
                DateTimeFieldType.dayOfMonth(),
                5);

        assertEquals(-26632392845096L,rdtf.add(96828247384571904L,-7378697629708021757L));

    }

    public void test_getDivisor() {

        DividedDateTimeField rdtf = new DividedDateTimeField(
                DateTimeFieldType.dayOfMonth().getField(IslamicChronology.getInstance()),
                null,
                DateTimeFieldType.dayOfMonth(),
                5);

        assertEquals(5,rdtf.getDivisor());
    }


}