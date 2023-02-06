package com.company.codewithharry;

import java.util.Scanner;

public class oops21_errors_and_exception {
    public static void main(String[] args) {
        /*
        // syntax error --> semicolon,undeclared variable etc
        int a = 5  // semicolon missing
        System.out.println(a+b); // b undeclared var
        */

        /*
         // logical error --> compile and run but produce wrong output also called bug
         // write a program to print all the numbers between 1 to 10
                System.out.println(2);
                for (int i=1; i<5; i++){
                    System.out.println(2*i+1);
                }
        */

        //runtime error --> exception error catch at runtime occurs though wrong input
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k " + 1000/k);
        // if we press 0 in input then we get an exception error

    }
}
