package com.company.practice.Arrays;

import java.util.Scanner;

public class array_reverse {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Content of the array : ");
        for (int i=0; i< arr.length; i++){
            System.out.println("Value of arr["+i+"] is "+arr[i]);
        }
        System.out.println("Content of the array in reverse order : ");
        for (int i=arr.length-1; i>=0; i--){
            System.out.println("Value of arr["+i+"] is "+arr[i]);
        }
    }
}
