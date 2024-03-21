package com.cdac;
import com.cdac.Asceding_order.*; // import everything from Ascending_order

import java.util.Arrays;

public class descending_order {
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,3,1,56};
        int x = arr.length;
        Arrays.sort(arr);
        System.out.println("Printing array in reverse order .....");
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
    }
}
