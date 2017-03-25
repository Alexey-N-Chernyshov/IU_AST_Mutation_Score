package org.joda.time.chrono;

import org.joda.time.DateTimeConstants;
import org.joda.time.chrono.BasicSingleEraDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import java.util.Locale;

public class TestBasicSingleEraDateTimeField extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestBasicSingleEraDateTimeField.class);
    }

    public TestBasicSingleEraDateTimeField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    public void test_get_1() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        try {
            tested.set(0, 0);
            fail("Exception expected");
        } catch (org.joda.time.IllegalFieldValueException e) {
            assertEquals("Value 0 for era must be in the range [1,1]", e.getMessage());
        }

    }

    public void test_set_2() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        assertEquals(0, tested.set(0, 1));
    }

    public void test_set_3() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        try {
            tested.set(1, 2);
            fail("Exception expected");
        } catch (org.joda.time.IllegalFieldValueException e) {
            assertEquals("Value 2 for era must be in the range [1,1]", e.getMessage());
        }
    }

    public void test_isLenient() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("");
        assertFalse(tested.isLenient());
    }

    public void test_set_4() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        try {
            tested.set(1, "str", new Locale("en"));
            fail("Exception expected");
        } catch (org.joda.time.IllegalFieldValueException e) {
            assertEquals("Value \"str\" for era is not supported", e.getMessage());
        }
    }

   public void test_set_5() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        try {
            tested.set(1, "str", new Locale("en"));
            fail("Exception expected");
        } catch (org.joda.time.IllegalFieldValueException e) {
            assertEquals("Value \"str\" for era is not supported", e.getMessage());
        }
    }

    public void test_set_6() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(0, tested.set(0, "1", new Locale("en")));
    }

    public void test_roundFloor() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(Long.MIN_VALUE, tested.roundFloor(0));
    }

    public void test_roundCeiling() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(Long.MAX_VALUE, tested.roundCeiling(0));
    }

    public void test_roundHalfFloor() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(Long.MIN_VALUE, tested.roundHalfFloor(0));
    }

    public void test_roundHalfCeiling() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(Long.MIN_VALUE, tested.roundHalfCeiling(0));
    }

    public void test_roundHalfEven() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(Long.MIN_VALUE, tested.roundHalfEven(0));
    }

    public void test_getDurationField() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertTrue(tested.getDurationField() instanceof UnsupportedDurationField);
    }

    public void test_getRangeDurationField() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(tested.getRangeDurationField(), null);
    }

    public void test_getMinimumValue() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(tested.getMinimumValue(), DateTimeConstants.CE);
    }

    public void test_getMaximumValue() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("1");
        assertEquals(tested.getMaximumValue(), DateTimeConstants.CE);
    }

    public void test_getAsText() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("str");
        assertEquals(tested.getAsText(0, new Locale("en")), "str");
    }

    public void test_getMaximumTextLength() {
        BasicSingleEraDateTimeField tested = new BasicSingleEraDateTimeField("str");
        assertEquals(tested.getMaximumTextLength(new Locale("en")), 3);
    }

}
