package com.cdac;

import java.util.Arrays;
import java.util.Scanner;

class  AB{
    public void array(int arr[],int len){
        Arrays.sort(arr);
        int len1 = len;
        System.out.println("printing array in reverse order ");
        for(int i=(len1-1);i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an array ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        AB ob = new AB();
        ob.array(arr,len);

    }
}
