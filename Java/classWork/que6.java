package com.company.classWork;
import java.util.Scanner;
import java.util.Arrays;

public class que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // insertion in array 1
        System.out.println("Enter array1 size : ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.printf("Enter %d elements of array in sorted order : \n",m);
        for (int i=0; i<m; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array1 : "+Arrays.toString(arr1));
        // insertion in array 2
        System.out.println("Enter array2 size : ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.printf("Enter %d elements of array in sorted order : \n",n);
        for (int i=0; i<n; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array2 : "+Arrays.toString(arr2));

        // merging the arrays
        int size = m+n;
        int count =0;
        int[] merge = new int[size];
        for (int i=0; i< arr1.length; i++){
            merge[i] = arr1[i];
            count++;
        }
        for (int j=0; j< arr2.length; j++){
            merge[count++] = arr2[j];
        }
        System.out.println("Merged Array : "+Arrays.toString(merge));

        // sorting merged array
        int temp;
        for (int i=0; i<size; i++){
            for (int j=i+1; j<size; j++){
                if (merge[i] > merge[j]){
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }
        System.out.println("Sorted Merged Array : "+Arrays.toString(merge));
    }
}
