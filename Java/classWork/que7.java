package com.company.classWork;
import java.util.Arrays;
import java.util.Scanner;

public class que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" elements of the array : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : "+ Arrays.toString(arr));

        // partitioning array into even and odd
        int[] newarr = new int[size];
        int count = 0;
        for (int i=0; i<size; i++)
        {
            if (arr[i]%2 == 0)
            {
                newarr[count] = arr[i];
                count++;
            }
        }
        for (int i=0; i<size; i++)
        {
            if (arr[i]%2 != 0)
            {
                newarr[count] = arr[i];
                count++;
            }
        }
        System.out.println("New Array : "+ Arrays.toString(newarr));
    }
}
