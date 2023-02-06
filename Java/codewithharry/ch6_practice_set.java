package com.company.codewithharry;
import java.util.Scanner;

public class ch6_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
       /*
       float [] num = {10.5f,20.5f,30.5f,40.5f,50.5f};
        float sum = 0.0f;
        for (int j=0; j< num.length; j++){
            sum += num[j];
        }
        System.out.printf("Total sum = %f",sum);
        */

        // Question 2
        /*
        int [] array = {15,35,45,68,54,86,78,98,74,56,36,75};
        System.out.println("Enter an integer to check it's present in array or not : ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for (int element: array){
            if (num == element){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println("The value is present in the array !!");
        }
        else {
            System.out.println("The value is not present in the array !!");
        }
         */

        // Question 3
        /*
        int [] marks = new int[5];
        System.out.println("Enter the marks of 5 subjects to calculate average : ");
        for (int i=0; i< marks.length; i++){
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0; i< marks.length; i++){
            sum += marks[i];
        }
        System.out.println("Average of marks : " + sum/5.0f);
        */

        // Question 4
        /*
        int [][] mtx1 ={ {1,2,3},{4,5,6} };
        int [][] mtx2 ={ {7,8,9},{4,3,2} };
        int [][] res = { {0,0,0},{0,0,0} };
        for (int i=0; i< mtx1.length; i++){
            for (int j=0; j< mtx2[i].length; j++){
                res[i][j] = mtx1[i][j]+mtx2[i][j];
            }
        }
        System.out.println("Sum of matrices : ");
        for (int i=0; i<res.length; i++){
            for (int j=0; j<res[i].length; j++ ){
                System.out.print(res[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
         */

        // Question 5
        // reverse of the array
        /*
        int [] array = {15,35,45,68,54,86,78,98,74,56,36,75};
        int n = Math.floorDiv(array.length, 2);
        int temp;
        int l = array.length;
        for (int i=0; i<n; i++){
            // swap a[i] and a[l-i-1]
            temp = array[i];
            array[i] = array[l-i-1];
            array[l-i-1] = temp;
        }
        System.out.println("Reverse of an array : ");
        for (int element: array) {
            System.out.print(element+" ");
        }
         */

        // Question 6
        /*
        int [] array = {15,35,45,68,54,86,78,98,74,56,36,75};
        int max = 0;
        for (int e: array){
            if (e>max){
                max = e;
            }
        }
        System.out.println("Greater element of array : " + max);
        */


        // Question 7
        /*
        int [] array = {35,45,68,54,86,78,9,98,74,56,36,75};
        int min = array[0];
        for (int e: array){
            if (e<min){
                min = e;
            }
        }
        System.out.println("Greater element of array : " + min);
        */

        // Question 8
        // sort the array
        int [] arr = {15,35,45,68,54,86,78,98,74,56,36,75};
        int l = arr.length;
        int temp;
        for (int i=0; i<l; i++){
            for (int j=i+1; j<l; j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for (int e: arr){
            System.out.print(e + " ");
        }

    }
}
