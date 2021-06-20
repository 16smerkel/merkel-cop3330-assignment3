/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileMaker {
    public static void javaMaker()
    {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("index.js"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void cssMaker()
    {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("index.css"));
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
