package com.cdac;

import java.util.Arrays;

public class Largest_smallest_from_array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,35,5};
        Arrays.sort(arr); // this method always sort array ascending order .
        System.out.println("Largest from an array = "+arr[4]);
        System.out.println("Smallest from an array = "+arr[0]);


    }
}
