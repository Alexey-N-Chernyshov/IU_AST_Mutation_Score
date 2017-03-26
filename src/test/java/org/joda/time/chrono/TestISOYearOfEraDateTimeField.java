package org.joda.time.chrono;

import org.joda.time.chrono.ISOYearOfEraDateTimeField;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.MockPartial;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import java.lang.reflect.Method;

public class TestISOYearOfEraDateTimeField extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestISOYearOfEraDateTimeField.class);
    }

    public TestISOYearOfEraDateTimeField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

   protected void tearDown() throws Exception {
    }

    public void test_getRangeDurationField() {
        DurationField durationField = ISOYearOfEraDateTimeField.INSTANCE.getRangeDurationField();
        assertNotEquals(null, durationField); 
    }

    public void test_get() {
        assertEquals(1970, ISOYearOfEraDateTimeField.INSTANCE.get(1));
        assertEquals(1970, ISOYearOfEraDateTimeField.INSTANCE.get(1));
    }

    public void test_add() {
        assertEquals(31536000001L, ISOYearOfEraDateTimeField.INSTANCE.add(1L, 1));
        assertEquals(315532800001L, ISOYearOfEraDateTimeField.INSTANCE.add(1L, 10));
    }

    public void test_add2() {
        assertEquals(31536000001L, ISOYearOfEraDateTimeField.INSTANCE.add(1L, 1L));
        assertEquals(315532800001L, ISOYearOfEraDateTimeField.INSTANCE.add(1L, 10L));
    }

    public void test_addWrapField() {
        assertEquals(31536000001L, ISOYearOfEraDateTimeField.INSTANCE.addWrapField(1L, 1));
        assertEquals(315532800001L, ISOYearOfEraDateTimeField.INSTANCE.addWrapField(1L, 10));
    }

    public void test_addWrapField2() {
        ReadablePartial instant = MockPartial.EMPTY_INSTANCE;
        int[] values = {1, 2, 3};
        int[] res = ISOYearOfEraDateTimeField.INSTANCE.addWrapField(instant, 1, values, 1);
        assertEquals(3, res.length);
    }

    public void test_getDifference() {
        assertEquals(0, ISOYearOfEraDateTimeField.INSTANCE.getDifference(100L, 20L));
    }

    public void test_getDifferenceAsLong() {
        assertEquals(0L, ISOYearOfEraDateTimeField.INSTANCE.getDifferenceAsLong(100L, 20L));
    }

    public void test_set() {
        assertEquals(-62135596800000L, ISOYearOfEraDateTimeField.INSTANCE.set(0L, 1));
        assertEquals(-62104060800001L, ISOYearOfEraDateTimeField.INSTANCE.set(-1L, 1));
        assertEquals(-62135596799999L, ISOYearOfEraDateTimeField.INSTANCE.set(1L, 1));
        assertEquals(-62115871624193L, ISOYearOfEraDateTimeField.INSTANCE.set(Long.MAX_VALUE, 1));
        assertEquals(-62187030775808L, ISOYearOfEraDateTimeField.INSTANCE.set(Long.MIN_VALUE, 1));
    }

    public void test_set2() {
        try {
            ISOYearOfEraDateTimeField.INSTANCE.set(0L, Integer.MAX_VALUE);
            fail("no exception");
        } catch (Exception e) {
            // ok
        }
    }

    public void test_set3() {
        try {
            ISOYearOfEraDateTimeField.INSTANCE.set(0L, Integer.MIN_VALUE);
            fail("no exception");
        } catch (Exception e) {
            // ok
        }
    }

    public void test_getMinimumValue() {
        assertEquals(0, ISOYearOfEraDateTimeField.INSTANCE.getMinimumValue());
    }

    public void test_getMaximumValue() {
        assertEquals(292278993, ISOYearOfEraDateTimeField.INSTANCE.getMaximumValue());
    }

    public void test_roundCeiling() {
        assertEquals(31536000000L, ISOYearOfEraDateTimeField.INSTANCE.roundCeiling(1L));
    }

    public void test_remainder() {
        assertEquals(1, ISOYearOfEraDateTimeField.INSTANCE.remainder(1L));
    }

    public void test_readResolve() {
        try {
            Class c = ISOYearOfEraDateTimeField.class;
            Method method = c.getDeclaredMethod("readResolve", null);
            method.setAccessible(true);
            assertTrue(method.invoke(ISOYearOfEraDateTimeField.INSTANCE, null) instanceof ISOYearOfEraDateTimeField);
        } catch (Exception e) {
            fail(e.toString());
        }
    }

}
