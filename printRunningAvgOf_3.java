package com.cdac;

public class printRunningAvgOf_3 {
    public static void main(String[] args) {
        int mul=1;
        int arr[]= {5,14,5};
        int avg =0;
        int divide =3;
        int len = arr.length;
        for(int i=0;i<(len-2);i++){
            mul = (arr[i]+arr[i+1]+arr[i+2]);
            avg = (mul/3);
            System.out.println("The avg is = "+avg);
        }



    }
}
