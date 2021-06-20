/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex42;

public class PrintThings {
    public static String printHeader() {
        String temp = "";
        temp = ("Last      First     Salary\n--------------------------");
        return temp;
    }

    public static String printRecords(NewEmployee[] theRecords, String theHeader, int count) {
        String temp = theHeader;
        int spaceCount = 10;
        for(int i = 0; i < count; i++)
        {
            NewEmployee curEmployee =  theRecords[i];
            temp += "\n" + curEmployee.lastName;
            int spaceNo = curEmployee.lastName.length();
            for(int j = 0; j < (spaceCount - spaceNo); j++)
                temp += (" ");
            temp += curEmployee.firstName;
            spaceNo = curEmployee.firstName.length();
            for(int j = 0; j < (spaceCount - spaceNo); j++)
                temp += (" ");
            temp += curEmployee.salary;
        }
        return temp;
    }
}