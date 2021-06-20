/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex41;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public void finishFile(String bigString, int count) throws IOException {
        String topPart = ("Total of " + count + " names\n" + "-----------------");
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("exercise41_output.txt"));
        bw.write(topPart + "\n");
        bw.write(bigString);
        bw.close();
    }
}
