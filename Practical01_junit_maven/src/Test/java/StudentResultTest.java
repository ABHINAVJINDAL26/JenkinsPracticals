package Test.java;

import main.java.StudentResult;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentResultTest {

    StudentResult sr = new StudentResult();

    @Test
    public void testPassCase() {
        assertEquals("PASS", sr.checkResult(80));
    }

    @Test
    public void testFailCase() {
        assertEquals("FAIL", sr.checkResult(20));
    }

    @Test
    public void testBoundaryCase() {
        assertEquals("PASS", sr.checkResult(40));
    }

    @Test
    public void testNegativeMarks() {
        assertEquals("INVALID", sr.checkResult(-5));
    }

    @Test
    public void testAboveHundred() {
        assertEquals("INVALID", sr.checkResult(120));
    }
}