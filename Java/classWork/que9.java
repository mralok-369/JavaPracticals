package com.company.classWork;
import java.util.Scanner;
import java.util.Arrays;

public class que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the "+size+" elements of the array : ");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array : "+Arrays.toString(arr));

        System.out.println("\n\nEnter the position where you want to insert a new element : ");
        int position = sc.nextInt();
        System.out.println("Enter the value : ");
        int value = sc.nextInt();

        // inserting new element in array
        int newarr[] = new int[size+1];
        for (int i=0; i<size+1; i++) {
            if (i < position-1)
                newarr[i] = arr[i];
            else if (i == position - 1)
                newarr[i] = value;
            else
                newarr[i] = arr[i - 1];
        }
        System.out.println("New Array : "+Arrays.toString(newarr));

    }
}
