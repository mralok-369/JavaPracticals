package com.company.classWork;
import java.util.Arrays;
import java.util.Scanner;

public class que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.printf("Enter %d elements of array : \n",n);
        for (int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Original Array : "+Arrays.toString(array));

        System.out.println("Enter the sum of numbers whose pair you want to find : ");
        int sum = sc.nextInt();
        System.out.printf("Pairs of number whose sum is %d\n",sum);
        for (int i=0; i< array.length; i++){
            for (int j=0; j< array.length; j++){
                if (array[i]+array[j] == sum){
                    System.out.printf("(%d,%d) ",array[i],array[j]);
                }
            }
        }
    }
}
