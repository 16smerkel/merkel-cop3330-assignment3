/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex41;

import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.io.PrintStream;
/*
take in each line from the txt file
make each line a separate line print
for each line in file, count increases
use the count to see how many names in list for for loop and run loop to sort alphabetically
use a temp to switch spots
print number of names using count and then alphabetical list
 */

public class Solution41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inFile = null;
        String bigString = "";
        String[] employeeName = new String[1000];
        int count = 0;
        try {
            inFile = new Scanner(new File("exercise41_input.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                employeeName[count] = line;
                count++;
            }
            bigString = EmployeeList.sortEmployee(count, employeeName);
            finishFile(bigString, count);
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void finishFile(String bigString, int count) throws IOException {
        String topPart = ("Total of " + count + " names\n" + "-----------------");
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("exercise41_output.txt"));
        bw.write(topPart + "\n");
        bw.write(bigString);
        bw.close();
    }
}