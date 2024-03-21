package com.cdac;

import java.util.Arrays;

public class Asceding_order {
    public static void main(String[] args) {
        int arr[] = {1,2,5,7,9,-1,-2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
