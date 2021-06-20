/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex45;

/*
take in each line from the txt file
find out how to swap words in a String
create a targeted word "utilize" and replacement word "use"
ask the user to name the output file
using the new name create the output file
insert the newly created string with the replacements into output file
 */

import java.io.*;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inFile = null;
        String newString = "";
        try {
            inFile = new Scanner(new File("exercise45_input.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                newString += FileWork.fixLine(line);
            }
            System.out.println("What would you like to name the output file?");
            String outputText = scanner.nextLine();
            FileWork.finalizeOutput(outputText, newString);
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
