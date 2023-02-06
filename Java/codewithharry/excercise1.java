package com.company.codewithharry;
import java.util.Scanner;
// CBSE percentage calculator
public class excercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Percentage Calculator");
        System.out.println("Enter subject 1 marks");
        float s1 = sc.nextInt();
        System.out.println("Enter subject 2 marks");
        float s2 = sc.nextInt();
        System.out.println("Enter subject 3 marks");
        float s3 = sc.nextInt();
        System.out.println("Enter subject 4 marks");
        float s4 = sc.nextInt();
        System.out.println("Enter subject 5 marks");
        float s5 = sc.nextInt();
        float sum = s1 + s2 + s3 + s4 + s5;
        System.out.println("Total number = "+sum);
        float percentage = sum/50;
        System.out.println(" Total Percentage : ");
        System.out.println(percentage);
    }
}
