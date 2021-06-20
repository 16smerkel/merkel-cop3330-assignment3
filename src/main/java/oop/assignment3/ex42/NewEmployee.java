/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex42;

public class NewEmployee {
    String lastName;
    String firstName;
    String salary;

    public NewEmployee(String lastName, String firstName, String salary)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public static String goThroughLast(String line){
        String temp = "";
        for (char c : line.toCharArray()) {
            if (c == ',') {
                break;
            }
            else {
                temp += c;
            }
        }
        return temp;
    }

    public static String goThroughFirst(String line){
        String temp = "";
        int checkCount = 0;
        for (char c : line.toCharArray()) {
            if (c == ',' && checkCount == 0) {
                checkCount = 1;
                temp = "";
            }
            else if (c == ',' && checkCount == 1) {
                break;
            }
            else {
                temp += c;
            }
        }
        return temp;
    }

    public static String goThroughSal(String line){
        String temp = "";
        int checkCount = 0;
        for (char c : line.toCharArray()) {
            if (c == ',' && checkCount == 0) {
                checkCount = 1;
                temp = "";
            }
            else if (c == ',' && checkCount == 1) {
                checkCount = 2;
                temp = "";
            }
            else if (c == ',' && checkCount == 2) {
                break;
            }
            else {
                temp += c;
            }
        }
        return temp;
    }

    public static NewEmployee lineSave(String line){
        String lastName = NewEmployee.goThroughLast(line);
        String firstName = NewEmployee.goThroughFirst(line);
        String salary = NewEmployee.goThroughSal(line);
        NewEmployee curEmployee = new NewEmployee(lastName, firstName, salary);
        return curEmployee;
    }


}
