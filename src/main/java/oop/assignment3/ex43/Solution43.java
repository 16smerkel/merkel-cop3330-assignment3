/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex43;

/*
    create a class that creates the website with the following input
    ask if for the name and author and save them
    ask if folder should be javascript or css
    if yes to both or either make the website respectively
    make the html file and write meta and title to it
 */

import java.io.*;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the name of the website?");
        String theSite = scanner.nextLine();
        System.out.println("What is the author's name?");
        String theAuthor = scanner.nextLine();
        System.out.println("Do you want a folder for JavaScript?");
        String javaAns = scanner.nextLine();
        System.out.println("Do you want a folder for CSS?");
        String cssAns = scanner.nextLine();
        if(javaAns.equals("y") && cssAns.equals("y"))
        {
            String theSites = WebsiteMaker.showWebsite(theSite);
            theSites += WebsiteMaker.showJava(theSite);
            theSites += WebsiteMaker.showCSS(theSite);
            System.out.println(theSites);
            FileMaker.javaMaker();
            FileMaker.cssMaker();
        }
        else if(javaAns.equals("y"))
        {
            String theSites = WebsiteMaker.showWebsite(theSite);
            theSites += WebsiteMaker.showJava(theSite);
            System.out.println(theSites);
            FileMaker.javaMaker();
        }
        else if(cssAns.equals("y"))
        {
            String theSites = WebsiteMaker.showWebsite(theSite);
            theSites += WebsiteMaker.showCSS(theSite);
            System.out.println(theSites);
            FileMaker.cssMaker();
        }
        else
        {
            String theSites = WebsiteMaker.showWebsite(theSite);
            System.out.println(theSites);
        }
        try {
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("index.html"));
            bw.write("<!DOCTYPE html>\n <html lang=" + '"' + "en" + '"' + ">\n <head>\n <meta " + theSite + ">\n <title>" + theAuthor + "</title>\n </head>\n <body>\n\n </body>\n</html>");
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
