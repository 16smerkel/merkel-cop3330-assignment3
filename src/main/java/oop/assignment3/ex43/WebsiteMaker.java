/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex43;

public class WebsiteMaker {
    public static String showWebsite(String theSite) {
        String temp = "";
        temp += ("Created ./website/" + theSite + "\n");
        temp += ("Created ./website/" + theSite + "/index.html\n");
        return temp;
    }

    public static String showJava(String theSite) {
        String temp = "";
        temp += ("Created ./website/" + theSite + "/js/\n");
        return temp;
    }

    public static String showCSS(String theSite) {
        String temp = "";
        temp += ("Created ./website/" + theSite + "/css/\n");
        return temp;
    }
}
