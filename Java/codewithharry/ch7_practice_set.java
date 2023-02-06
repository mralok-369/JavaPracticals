package com.company.codewithharry;
import java.util.Scanner;

public class ch7_practice_set {
    // Question 1 methods
    static void table(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    // Question 2 methods
    static void halfPyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Question 3 methods
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }
    // Question 4 methods
    static void inversePyramid(int n){
        for (int i=1; i<=n; i++){
            for (int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Question 5 methods
    static int fibonaci(int n){
        /*if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }*/
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    // Question 6 methods
    static float avg(int ...arr){
        // available as int [] arr;
        float result = 0;
        for (int a:arr){
            result += a;
        }
        float average = result/arr.length;
        return average;
    }
    // Question 7 methods (recursive method of que 4)
    static void repeat_que4(int n){
        if (n>0){
            repeat_que4(n-1);
            for (int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Question 8 methods (recursive method of que 2)
    static void repeat_que2(int n){
        if (n>0){
            repeat_que2(n-1);
            for (int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Question 9 methods
    static void cel_to_frhn(float c){
        float result = (c*1.8f)+32;
        System.out.println(result);
    }
    // Question 10 methods
    static void add_N_natural_number(int n){
        int sum = 0;
        for (int i=n; i>0; i--){
            sum = sum+i;
        }
        System.out.printf("The sum of %d natural number is : %d",n,sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        /*
        System.out.println("Enter a number to find it's multiplication table : ");
        int num = sc.nextInt();
        System.out.printf("Table of %d : \n",num);
        table(num);
        */

        // Question 2
        /*
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        halfPyramid(row);
        */

        // Question 3
        /*
        System.out.println("Enter the value of N : ");
        int num = sc.nextInt();
        int s = sum(num);
        System.out.printf("Sum of %d natural number = %d",num,s);
        */

        // Question 4
        /*
        System.out.println("Enter the number of rows : ");
        int row = sc.nextInt();
        inversePyramid(row);
        */

        // Question 5
        /*
        System.out.println("Enter the number of terms in fibonacci series : ");
        int t = sc.nextInt();
        int terms = fibonaci(t);
        System.out.println(terms);
        */

        // Question 6
        /*
        System.out.println("The average of passed number : " + avg(145,24,354,453,95));
        */

        // Question 7 (recursive method of que 4)
        /*
        System.out.println("Enter the number of rows : ");
        int number = sc.nextInt();
        repeat_que4(number);
         */

        // Question 8 (recursive method of que 2)
        /*
            System.out.println("Enter the number of rows : ");
            int rows = sc.nextInt();
            repeat_que2(rows);
         */

        // Question 9
        /*
        System.out.println("Enter temp in degree celsius : ");
        float temp = sc.nextFloat();
        cel_to_frhn(temp);
         */

        // Question 10
        System.out.println("Enter the value of N : ");
        int num = sc.nextInt();
        add_N_natural_number(num);

    }
}
