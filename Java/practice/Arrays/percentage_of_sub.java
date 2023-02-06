package com.company.practice.Arrays;
import java.util.Scanner;

public class percentage_of_sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] sub = new int[5];
        System.out.println("Enter the marks of the 5 subjects : ");
        for (int i=0; i<sub.length; i++){
            sub[i] = sc.nextInt();
        }
        int total = 0;
        for (int i=0; i<sub.length; i++){
            total += sub[i];
        }
        float per =(float) total/5;
        System.out.println("Percentage = " + per);
    }
}
