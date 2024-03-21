package com.cdac;

import java.util.Random;

public class Random_number {
    public static void main(String[] args) {
        Random r = new Random();
//        int x = r.nextInt(50); // print int random number below 50
//        System.out.println(x);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=r.nextInt(50);//
        }
        System.out.println("Printing array ");
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
