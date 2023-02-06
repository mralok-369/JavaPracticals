package com.company.codewithharry;
import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if else statement
//        System.out.println("Enter your age : ");
//        int age = sc.nextInt();
//        if(age > 18){
//            System.out.println("Yes boy you can drive!");
//        }
//        else {
//            System.out.println("No boy you cannot drive yet!");
//        }

        // else if ladder
//        System.out.println("Enter your marks for grade : ");
//        int marks = sc.nextInt();
//        if (marks>=90 && marks<100){
//            System.out.println("Your grade is A");
//        }
//        else if(marks>=80 && marks<90){
//            System.out.println("Your grade is B");
//        }
//        else if(marks>=70 && marks<80){
//            System.out.println("Your grade is C");
//        }
//        else if(marks>=60 && marks<70){
//            System.out.println("Your grade is D");
//        }
//        else if(marks>=50 && marks<60){
//            System.out.println("Your grade is E");
//        }
//        else if(marks>=10 && marks<50){
//            System.out.println("Your grade is F");
//        }
//        else {
//            System.out.println("Enter a valid number! thank you!!");
//        }

        // switch statement
//        System.out.println("Enter your age : ");
//        int age = sc.nextInt();
//        switch (age){
//            case 18:
//                System.out.println("You are going to become a adult");
//                break;
//            case 23:
//                System.out.println("You are going to join a job");
//                break;
//            case 60:
//                System.out.println("You are going to retiered");
//                break;
//            default:
//                System.out.println("Enjoy your life!!");
//        }
//        System.out.println("Thanks for using");

        // for grade of a student
        System.out.println("Enter your percentage : ");
        int marks = sc.nextInt();
        switch (marks/10){
            case 9:
                System.out.println("Your grade is A");
                break;
            case 8:
                System.out.println("Your grade is B");
                break;
            case 7:
                System.out.println("Your grade is C");
                break;
            case 6:
            case 5:
                System.out.println("Your grade is D");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Your grade is F");
                break;
            default:
                System.out.println("Enter a valid number !! Thank you !!!");
        }

    }
}
