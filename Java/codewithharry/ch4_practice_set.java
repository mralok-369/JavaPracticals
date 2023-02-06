package com.company.codewithharry;
import java.util.Scanner;

public class ch4_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
//        System.out.println("Enter your age : ");
//        int age = sc.nextInt();
//        if (age >= 18){
//            System.out.println("You are an adult !!");
//        }
//        else {
//            System.out.println("You are not an adult !!");
//        }

        // Question 2
//        System.out.println("Enter your marks in physics : ");
//        byte p = sc.nextByte();
//        System.out.println("Enter your marks in chemistry : ");
//        byte c = sc.nextByte();
//        System.out.println("Enter your marks in maths : ");
//        byte m = sc.nextByte();
//        float avg = (p+c+m)/3.0f;
//        System.out.println("Your overall percentage is : "+ avg);
//        if (avg>=40 && p>=33 && c>33 && m>=33){
//            System.out.println("Congratulations, you have been promoted");
//        }
//        else {
//            System.out.println("Sorry, you have not been promoted! try again.");
//        }

        // Question 3
//        System.out.println("Enter your salary for calculating percentage : ");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income<=2.5f){
//            tax = tax+0;
//        }
//        else if (income<=5.0f && income>2.5f){
//            tax = tax + 0.05f * (income-2.5f);
//        }
//        else if (income>5.0f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (income-5f);
//        }
//        else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f-5.0f);
//            tax = tax + 0.3f * (income-10.0f);
//        }
//        System.out.println("The total tax paid by the employee is : " + tax);

        // Question 4
//        System.out.println("Enter the number to find day name : ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednessday");
//            case 4 -> System.out.println("Thrusday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // Question 5
//        System.out.println("Enter a year to check it's leap year or not");
//        int year = sc.nextInt();
//        if (year%4==0 || year%100==0 || year%400==0){
//            System.out.println(year + " is a leap year.");
//        }
//        else{
//            System.out.println(year + " is not a leap year.");
//        }

        // Question 6
        System.out.println("Enter your website :");
        String site = sc.next();
        if (site.endsWith(".com")){
            System.out.println(site + " is a comercial website");
        }
        else if(site.endsWith(".in")){
            System.out.println(site + " is an indian website");
        }
        else if (site.endsWith(".org")){
            System.out.println(site + " is an organization website");
        }
    }
}
