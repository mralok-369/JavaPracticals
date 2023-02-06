package com.company.classWork;
import java.util.Scanner;

public class que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects : ");
        int sum = 0;
        for (int i=0; i<5; i++){
            int marks = sc.nextInt();
            sum += marks;
        }
        System.out.println("Total number = "+ sum);
        float percentage = (float) (sum/5);
        System.out.println("Percentage = "+ percentage);
    }
}
