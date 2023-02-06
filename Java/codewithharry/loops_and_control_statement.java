package com.company.codewithharry;
import java.util.Scanner;

public class loops_and_control_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while loop
//        System.out.println("Enter a number to find it's table : ");
//        int num = sc.nextInt();
//        int i=1;
//        while (i<=10) {
//            int mul = num*i;
//            System.out.printf("%d x %d = %d\n",num,i,mul);
//            ++i;
//        }

        // Quick quiz
        // natural number between 100 to 200
//        System.out.println("Natural number between 100 to 200");
//        int i = 101;
//        while (i<200){
//            System.out.println(i);
//            i++;
//        }

        // do while loop
//        System.out.println("Enter a number to find it's table : ");
//        int num = sc.nextInt();
//        int i=1;
//        do {
//            int mul = num*i;
//            System.out.printf("%d x %d = %d\n",num,i,mul);
//            ++i;
//        } while (i<=10);

        // quick quiz
        // print first n natural number
//        System.out.println("Enter value of N : ");
//        int n = sc.nextInt();
//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i<=n);

        // for loop
//        System.out.println("Enter a number to find it's table : ");
//        int num = sc.nextInt();
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d x %d = %d\n",num,i,num*i);
//        }

        // Qick quiz
        // print first N odd number of a given number
//        System.out.println("Enter value of N : ");
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }


        // control statements

        // break statement
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("Java is Great !!");
//            if (i==2){
//                System.out.println("Ending the loop ");
//                break;
//            }
//        }

        // continue statement
        for (int i=1; i<5; i++){
            System.out.println(i);
            if (i==3){
                System.out.println("move to the next iteration ");
                continue;
            }
            System.out.println("Java is Great !!");
        }

    }
}
