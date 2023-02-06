package com.company.practice.Arrays;

import java.util.Scanner;

public class array_search_particular_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,21,63,74,59,67,97,38,449,110};
        boolean found = false;
        System.out.println("Enter the number you want to search : ");
        int n =sc.nextInt();
        for (int i=0; i<arr.length; i++){
            if (n == arr[i]){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Yes, number is present in the array.");
        } else {
            System.out.println("No, number is not present in the array.");
        }
    }
}
