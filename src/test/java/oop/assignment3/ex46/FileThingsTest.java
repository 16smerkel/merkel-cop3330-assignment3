package oop.assignment3.ex46;

import oop.assignment3.ex45.FileWork;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileThingsTest {

    @Test
    void readInFile_set1() {
        FileThings detector = new FileThings();
        String actual = detector.readInFile("badger badger badger");
        String expected = "badger badger badger ";
        assertEquals(expected, actual);
    }

    @Test
    void readInFile_set2() {
        FileThings detector = new FileThings();
        String actual = detector.readInFile("mushroom snake badger badger");
        String expected = "mushroom snake badger badger ";
        assertEquals(expected, actual);
    }
}