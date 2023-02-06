package com.company.codewithharry;
import java.util.Scanner;

public class ch14_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        /*
        int a = 5 //syntax error
        System.out.println(a);
        int age = 78;
        int year_born = 2000-78; // logical error
        System.out.println(6/0); // runtime error
        */

        // Question 2
        /*
        try {
            int a = 666/0;
            System.out.println(a);
        } catch (IllegalArgumentException e){
            System.out.println("hehe");
        } catch (ArithmeticException e){
            System.out.println("haha");
        }  */

        // Question 3
        boolean flag = true;
        int [] marks = new int[5];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        marks[3] = 63;
        marks[4] = 25;
        int index;
        int i = 0;
        while (flag && i<5){
            try {
                System.out.println("Enter array index : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e){
                System.out.println("Invalid index...!!");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error");
        }

    }
}
