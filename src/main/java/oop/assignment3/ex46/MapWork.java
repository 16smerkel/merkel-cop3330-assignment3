/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Sean Merkel
 */
package oop.assignment3.ex46;

import java.util.Map;
import java.util.TreeMap;

public class MapWork {
    Map<String, Integer> theMap;
    Map<String, Integer> sortedMap;

    public static Map<String, Integer> putInMap(Map<String, Integer> theMap, int len, String[] arr)
    {
        for (int i = 0; i < len; i++)
        {
            if (theMap.containsKey(arr[i]))
            {
                theMap.put(arr[i], theMap.get(arr[i]) + 1);
            } else
            {
                theMap.put(arr[i], 1);
            }
        }
        return theMap;
    }

    public static void printHistogram(Map<String, Integer> sortedMap)
    {
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i = 0; i < 8 - entry.getKey().length(); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
