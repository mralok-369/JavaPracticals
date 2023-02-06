package com.company.codewithharry;
import java.util.Scanner;

public class method_recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);  // recursion
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial : ");
        int n = sc.nextInt();
        System.out.printf("Factorial of %d = %d",n,factorial(n));

    }
}
