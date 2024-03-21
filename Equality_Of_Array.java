package com.cdac;

import java.util.Arrays;

class A{
    public void arr1(int arr[],int arr1[]){

        int i = ( Arrays.compare(arr,arr1)); //Arrays comparision
        if(i==(-1)){
            System.out.println("Not Equal");
        }
        else {
            System.out.println("Equal....");
        }
    }

}

public class Equality_Of_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int arr1[] = {1,2,5};
        A ob = new A();
        ob.arr1(arr,arr1);

    }
}
