/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex46;

/*
take in the text from the input file
make the text one whole String with spaces for the \n slots
split the string where the spaces are to create an array
run through the newly created array
insert the words into the map and add to a counter if the word appears again
create a new map to insert the sorted words and count into
print out each word and the number of times it appeared using *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inFile = null;
        String str = "";
        try {
            inFile = new Scanner(new File("exercise46_input.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                str += FileThings.readInFile(line);
            }
            Map<String, Integer> theMap = new TreeMap<>();
            String arr[] = str.split(" ");
            int len = arr.length;
            theMap = MapWork.putInMap(theMap, len, arr);
            Map<String, Integer> sortedMap = new TreeMap<String, Integer>(theMap);
            MapWork.printHistogram(sortedMap);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}