/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex44;

public class checkDetector {
    public static int spaceCheck(char c, int spaceCount) {
        if (c == '{') {
            spaceCount = 1;
        }
        return spaceCount;
    }

    public static int colonCheck(char c, int colonCount) {
        if (c == ':') {
            colonCount++;
        }
        return colonCount;
    }

    public static String spaceApply(String temp, char c, int spaceCount) {
        if (spaceCount == 1) {
            temp += c;
        }
        return temp;
    }
}
