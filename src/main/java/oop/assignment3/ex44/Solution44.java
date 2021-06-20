/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex44;
/*
find out how Json works
make the classes and get + set methods
take in info from the gson file
create a String of just the name, price, and quantity from the objects in the product class
create a List that can be ran through which a different product in each spot
make a while loop to keep asking question to user if correct product isn't given
once product is list is found print name, price, and quantity
 */

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Solution44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner inFile = null;
        String theJson = "[";
        try {
            inFile = new Scanner(new File("exercise44_input.json"));
            while (inFile.hasNextLine()) {
                int colonCount = 0;
                int spaceCount = 0;
                String line = inFile.nextLine();
                String temp = "";
                for (char c : line.toCharArray()) {
                    colonCount = checkDetector.colonCheck(c, colonCount);
                    spaceCount = checkDetector.spaceCheck(c, spaceCount);
                    temp = checkDetector.spaceApply(temp,c, spaceCount);
                }
                if (colonCount < 2) {
                    continue;
                } else {
                    theJson += temp;
                }
            }
            theJson += "]";
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        Gson gson = new Gson();
        Type datasetListType = new TypeToken<Collection<Dataset>>() {
        }.getType();
        List<Dataset> datasets = gson.fromJson(theJson, datasetListType);
        int weFoundIt = 0;
        while (weFoundIt == 0) {
            System.out.println("What is the product name? ");
            String curName = scanner.nextLine();
            for (Dataset dataset : datasets) {
                if (dataset.getName().equals(curName)) {
                    System.out.println("Name: " + dataset.getName());
                    System.out.println("Price: " + dataset.getPrice());
                    System.out.println("Quantity: " + dataset.getQuantity());
                    weFoundIt = 1;
                    break;
                }
            }
            if(weFoundIt != 1) {
                System.out.println("Sorry, that product was not found in our inventory.");
                weFoundIt = 0;
            }
        }
    }
}