package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void sortEmployee_works_for_set1() {
        EmployeeList detector = new EmployeeList();
        String[] theEmployees = {"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris", "Jones, Aaron" , "Swift, Geoffrey", "Xiong, Fong"};
        String actual = detector.sortEmployee(6, theEmployees);
        String expected = ("Johnson, Jim\nJones, Aaron\nJones, Chris\nLing, Mai\nSwift, Geoffrey\nZarnecki, Sabrina\n");
        assertEquals(expected, actual);
    }

    @Test
    void sortEmployee_works_for_set2() {
        EmployeeList detector = new EmployeeList();
        String[] theEmployees = {"Zarnecki, Sabrina", "Jones, Chris", "Jones, Aaron" , "Swift, Geoffrey", "Xiong, Fong"};
        String actual = detector.sortEmployee(4, theEmployees);
        String expected = ("Jones, Aaron\nJones, Chris\nSwift, Geoffrey\nZarnecki, Sabrina\n");
        assertEquals(expected, actual);
    }
}