package com.stackroute;

import java.util.Scanner;

public class InsertBinary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strn[] = insert();
        int n = strn.length;
        insertionSort(strn);
        /*Display Sorted array in descending order*/
        System.out.println("Array sorted in descending Order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(strn[i]);
        }
        System.out.println("Enter the string to be searched:");
        String search = scan.nextLine();
        int searchIndex = binarySearch(strn, search);

        if (searchIndex != -1) {
            System.out.println(strn[searchIndex] + "...found");
        } else
            System.out.println("Element not found!");

    }

    /*Method to insert the productName*/
    public static String[] insert() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the names");
        String[] strn = new String[10];
        for (int i = 0; i < 10; i++) {
            strn[i] = s.nextLine();
        }
        return strn;
    }
    /*Insertion sort*/
    public static void insertionSort(String[] strn)
    {
        String temp;
        for(int i = 1; i < strn.length; i++) // ar[i] is element to insert
        {
            temp = strn[i];
            int j = 0;
            for(j = i; j > 0; j--)
                if(temp.compareTo(strn[j - 1]) < 0)
                    strn[j] = strn[j - 1];
                else
                    break;
            strn[j] = temp;
        }
    }

    /*Method to implement binarySearch*/
    public static int binarySearch(String[] a, String x) {
        int low = 0;
        int high = a.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
