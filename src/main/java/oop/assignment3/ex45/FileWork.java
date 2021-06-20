/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex45;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWork {
    public static String fixLine(String line) throws IOException {
        String newString = "";
        String target = "utilize";
        String replacement = "use";
        String processed = line.replace(target, replacement);
        newString += processed;
        newString += "\n";
        return newString;
    }

    public static String getOutput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to name the output file?");
        String outputText = scanner.nextLine();
        return outputText;
    }

    public static void finalizeOutput(String outputText, String newString) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter(outputText));
        bw.write(newString);
        bw.close();
    }
}
