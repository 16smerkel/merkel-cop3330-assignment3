/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex42;

/*
take in each line from the txt file
make each line a separate line print
separate the line into last name first name and salary
print names and salary under the top part
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inFile = null;
        String bigString = "";
        NewEmployee[] theRecords = new NewEmployee[100];
        int count = 0;
        try {
            inFile = new Scanner(new File("exercise42_input.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                NewEmployee curEmployee = NewEmployee.lineSave(line);
                theRecords[count] = curEmployee;
                count++;
            }
            String theHeader = PrintThings.printHeader();
            bigString = PrintThings.printRecords(theRecords, theHeader, count);
            System.out.println(bigString);
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
