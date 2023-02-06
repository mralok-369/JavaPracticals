package com.company.classWork;
import java.util.Scanner;

public class que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square root of 1 to 10 : ");
        for (int i=1; i<=10; i++){
           System.out.println(Math.sqrt(i));
        }
        System.out.println();
        System.out.println("Cube root of 1 to 10 : ");
        for (int i=1; i<=10; i++){
            System.out.println(Math.cbrt(i));
        }
    }
}
