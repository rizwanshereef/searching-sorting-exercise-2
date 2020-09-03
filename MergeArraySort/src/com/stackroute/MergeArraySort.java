package com.stackroute;

import java.util.Arrays;

public class MergeArraySort {

    public static void main(String[] args) {
	int arr1[] = {1,23,35,54,86};
	int arr2[] = {5,9,27,39,99};
	int[] arr3 = new int[arr1.length+arr2.length];
	mergeSort(arr1,arr2,arr3);
	System.out.println("The sorted array is:\n" + Arrays.toString(arr3));


    }
/*Method to merge and sort array*/
    public static void mergeSort(int arr1[], int arr2[], int arr3[]){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i=0,j=0,k=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]<arr2[j]){
                arr3[k++] = arr1[i++];
            }
            else
                arr3[k++] = arr2[j++];
        }
        while(i<len1)
            arr3[k++] = arr1[i++];
        while(j<len2)
            arr3[k++] = arr2[j++];
    }
}
