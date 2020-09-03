package com.stackroute;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ListSortSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strn[] = insert();
        int n = strn.length;
        bubblesort(strn);
        /*Display Sorted array in descending order*/
        System.out.println("Array sorted in descending Order:");
        for (int i = 0; i < n; i++) {
            System.out.println(strn[i]);
        }
        /*Calling function to convert the sorted string to linkedlist*/
        LinkedList link = insertLink(strn);

        /*Check if the string is present on the linkedlist */
        System.out.println("Enter the element to be searched:");
        String value = scan.nextLine();
        check(link, value);


    }

    /*Method to insert the productName*/
    public static String[] insert() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the names");
        String[] strn = new String[5];
        for (int i = 0; i < 5; i++) {
            strn[i] = s.nextLine();
        }
        return strn;
    }

    /*Method to implement Bubble sort for String*/
    public static void bubblesort(String strn[]) {
        String temp;
        for (int j = 0; j < strn.length; j++) {
            for (int i = j + 1; i < strn.length; i++) {
/* comparing present string to next string */
                if (strn[i].compareTo(strn[j]) < 0) {
                    temp = strn[j];
                    strn[j] = strn[i];
                    strn[i] = temp;
                }
            }
        }
    }

    /*Method to convert String array to linked list*/

    public static LinkedList<String> insertLink(String[] strn) {
        LinkedList link = new LinkedList(Arrays.asList(strn));
        return link;
    }

    /*Method to check if the string is preset on the linkedlist*/
    public static void check(LinkedList link, String value) {
        int len = link.size();
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (link.get(i).equals(value)) {
                flag = true;
                break;
            } else
                flag = false;
        }
        if (flag)
            System.out.println(value + " found!");
        else
            System.out.println("Element not found");
    }
}
