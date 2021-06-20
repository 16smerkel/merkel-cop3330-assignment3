/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex41;

public class EmployeeList {
    String[] EmployeeList;

    public static String sortEmployee(int count, String[] employeeName){
        String temp;
        String bigString = "";
        for(int i = 0; i < count; i++)
        {
            for(int j = i+1; j < count; j++)
            {
                if (employeeName[i].compareTo(employeeName[j]) > 0)
                {
                    temp = employeeName[i];
                    employeeName[i] = employeeName[j];
                    employeeName[j] = temp;
                }
            }
            bigString += (employeeName[i] + "\n");
        }
        return bigString;
    }
}
