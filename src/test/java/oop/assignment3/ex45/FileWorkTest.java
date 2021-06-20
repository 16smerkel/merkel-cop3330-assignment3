package oop.assignment3.ex45;

import oop.assignment3.ex44.checkDetector;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileWorkTest {

    @Test
    void fixLine_check_for_use_set1() throws IOException {
        FileWork detector = new FileWork();
        String actual = detector.fixLine("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        String expected = "One should never utilize the word \"use\" in writing. Use \"use\" instead.\n";
        assertEquals(expected, actual);
    }

    @Test
    void fixLine_check_for_use_set2() throws IOException {
        FileWork detector = new FileWork();
        String actual = detector.fixLine("utilizes an IDE to write her Java programs\".");
        String expected = "uses an IDE to write her Java programs\".\n";
        assertEquals(expected, actual);
    }
}