package oop.assignment3.ex42;

import oop.assignment3.ex42.NewEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewEmployeeTest {

    @Test
    void goThroughLast_matches_set1() {
        NewEmployee detector = new NewEmployee("Ling","Mai","55900");
        String actual = detector.goThroughLast("Ling,Mai,55900");
        String expected = ("Ling");
        assertEquals(expected, actual);
    }

    @Test
    void goThroughFirst_matches_set1() {
        NewEmployee detector = new NewEmployee("Ling","Mai","55900");
        String actual = detector.goThroughFirst("Ling,Mai,55900");
        String expected = ("Mai");
        assertEquals(expected, actual);
    }

    @Test
    void goThroughSal_matches_set1() {
        NewEmployee detector = new NewEmployee("Ling","Mai","55900");
        String actual = detector.goThroughSal("Ling,Mai,55900");
        String expected = ("55900");
        assertEquals(expected, actual);
    }

    @Test
    void goThroughLast_matches_set2() {
        NewEmployee detector = new NewEmployee("Johnson","Jim","56500");
        String actual = detector.goThroughLast("Johnson,Jim,56500");
        String expected = ("Johnson");
        assertEquals(expected, actual);
    }

    @Test
    void goThroughFirst_matches_set2() {
        NewEmployee detector = new NewEmployee("Johnson","Jim","56500");
        String actual = detector.goThroughFirst("Johnson,Jim,56500");
        String expected = ("Jim");
        assertEquals(expected, actual);
    }

    @Test
    void goThroughSal_matches_set2() {
        NewEmployee detector = new NewEmployee("Johnson","Jim","56500");
        String actual = detector.goThroughSal("Johnson,Jim,56500");
        String expected = ("56500");
        assertEquals(expected, actual);
    }
}