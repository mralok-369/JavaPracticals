package com.company.classWork;
import java.util.Scanner;

public class que4 {
    static int factorial(int n){
        int fact = 1;
        for (int i=n; i>0; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial : ");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.println("Factorial = "+ result);
    }
}
