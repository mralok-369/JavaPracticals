package com.company.codewithharry;
import java.util.Scanner;

public class oops22_try_catch_block {
    public static void main(String[] args) {
        // Try-catch exception
        /*
        int a = 6;
        int b = 0;
        try {
            int c = a/b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
         */

        // Handling specific exceptions
        /*
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is : " + marks[ind]);
            System.out.println("the value of array-value/number is : " + marks[ind]/number);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        } catch (Exception e){
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
        System.out.println("End of the program...!!");
         */

        // Nested try-catch exception
        /*
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to Nested try-catch exception");
            try{
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e){
            System.out.println("Exception in level 1");
        }   */

        // Quick quiz
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter the array index : ");
            int ind = sc.nextInt();
            try{
                System.out.println("Welcome to Nested try-catch exception");
                try{
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");

    }
}
