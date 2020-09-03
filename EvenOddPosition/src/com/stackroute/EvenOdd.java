package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*Main class */
public class EvenOdd {

    public static void main(String[] args) {
        int num[] = {12, 34, 54, 23, 63, 64, 6};
        int sortNum[] = order(num);
        System.out.println(Arrays.toString(sortNum));
    }

    /*Method to sort the even indices in ascending order and odd indices as descending order*/
    public static int[] order(int num[]) {
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        /*Loop to extract the odd and even indices to */
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                even.add(num[i]);
            } else {
                odd.add(num[i]);
            }
        }
        /*Sort even indices in ascending order*/
        Collections.sort(even);
        /*Sort odd indices in descending order*/
        Collections.sort(odd, Collections.reverseOrder());
        /*Combining the sorted even and odd to a new list*/
        ArrayList<Integer> merge = new ArrayList<>();
        merge.addAll(even);
        merge.addAll(odd);
        /*Convert list to array*/
        int[] sortnum = new int[merge.size()];
        for (int i = 0; i < merge.size(); i++) {
            sortnum[i] = merge.get(i);
        }
        return sortnum;

    }
}
