package oop.assignment3.ex44;

import oop.assignment3.ex41.EmployeeList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkDetectorTest {

    @Test
    void spaceCheck_for_zero_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.spaceCheck('c', 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void colonCheck_for_zero_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.colonCheck('c', 0);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void colonCheck_for_zero_count_colon() {
        checkDetector detector = new checkDetector();
        int actual = detector.colonCheck(':', 0);
        int expected = 1;
        assertEquals(expected, actual);
    }


    @Test
    void spaceApply_for_zero_count() {
        checkDetector detector = new checkDetector();
        String actual = detector.spaceApply("theword",'c', 0);
        String expected = "theword";
        assertEquals(expected, actual);
    }
    @Test
    void spaceCheck_for_one_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.spaceCheck('c', 1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void colonCheck_for_one_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.colonCheck('c', 1);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void spaceApply_for_one_count() {
        checkDetector detector = new checkDetector();
        String actual = detector.spaceApply("theword",'c', 1);
        String expected = "thewordc";
        assertEquals(expected, actual);
    }
    @Test
    void spaceCheck_for_two_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.spaceCheck('c', 2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void colonCheck_for_two_count() {
        checkDetector detector = new checkDetector();
        int actual = detector.colonCheck('c', 2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void spaceApply_for_two_count() {
        checkDetector detector = new checkDetector();
        String actual = detector.spaceApply("theword",'c', 2);
        String expected = "theword";
        assertEquals(expected, actual);
    }
}