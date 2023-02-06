package com.company.practice.Arrays;

import java.util.Scanner;

public class array_element_search_with_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {10,21,63,74,59,67,97,38,449,110};
        int found = -1;
        int i;
        System.out.println("Enter the number you want to search : ");
        int n =sc.nextInt();
        for (i=0; i<arr.length; i++){
            if (n == arr[i]){
                found = i;
                break;
            }
        }
        if (found!=-1){
            System.out.println("Yes, number is present in the array at index : "+ found);
        } else {
            System.out.println("No, number is not present in the array.");
        }
    }
}
