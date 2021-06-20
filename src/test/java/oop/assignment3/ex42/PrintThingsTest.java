package oop.assignment3.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintThingsTest {

    @Test
    void printHeader() {
        PrintThings detector = new PrintThings();
        String actual = detector.printHeader();
        String expected = ("Last      First     Salary\n" + "--------------------------");
        assertEquals(expected, actual);
    }

    @Test
    void printRecords() {
        PrintThings detector = new PrintThings();
        String theHeader = ("Last      First     Salary\n" + "--------------------------");
        NewEmployee[] theRecords = new NewEmployee[10];
        theRecords[0] = NewEmployee.lineSave("Ling,Mai,55900");
        theRecords[1] = NewEmployee.lineSave("Johnson,Jim,56500");
        theRecords[2] = NewEmployee.lineSave("Jones,Aaron,46000");
        theRecords[3] = NewEmployee.lineSave("Jones,Chris,34500");
        theRecords[4] = NewEmployee.lineSave("Swift,Geoffrey,14200");
        theRecords[5] = NewEmployee.lineSave("Xiong,Fong,65000");
        theRecords[6] = NewEmployee.lineSave("Zarnecki,Sabrina,51500");
        String actual = detector.printRecords(theRecords, theHeader, 7);
        String expected = ("Last      First     Salary\n" + "--------------------------\n" + "Ling      Mai       55900\n" + "Johnson   Jim       56500\n" + "Jones     Aaron     46000\n" + "Jones     Chris     34500\n" + "Swift     Geoffrey  14200\n" + "Xiong     Fong      65000\n" + "Zarnecki  Sabrina   51500");
        assertEquals(expected, actual);
    }
}