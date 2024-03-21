package com.cdac;

import java.util.Scanner;

public class Print_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing Array ");
        for(int j =0;j<5;j++){
            System.out.println(arr[j]);
        }


    }
}
