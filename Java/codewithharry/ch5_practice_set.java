package com.company.codewithharry;
import java.util.Scanner;

public class ch5_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
//        System.out.println("Enter the number of rows : ");
//        int n = sc.nextInt();
//        for (int i=1; i<=n; i++){
//            for (int j=n; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Question 2
//        System.out.println("Enter the value of N : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        // using while loop
//        while (n!=0){
//            if (n%2==0){
//                sum += n;
//            }
//            n--;
//        }
//        System.out.printf("The sum of Even numbers = %d",sum);

        // using for loop
//        for (int i=1; i<=n; i++){
//            if (i%2==0){
//                sum += i;
//            }
//        }
//        System.out.printf("The sum of Even numbers less than %d = %d",n,sum);

        // Question 3
//        System.out.println("Enter a number to find it's multiplication table : ");
//        int num = sc.nextInt();
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d x %d = %d\n",num,i,num*i);
//        }

        // Question 4
//        System.out.println("Enter a number to find it's multiplication table in reverse order : ");
//        int num = sc.nextInt();
//        for (int i=num; i>0; i--){
//            System.out.printf("%d x %d = %d\n",num,i,num*i);
//        }

        // Question 5
//        System.out.println("Enter a number to find it's factorial : ");
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i=1; i<=n; i++){
//            if (n==0){
//                fact = 1;
//            }
//            else {
//                fact *= i;
//            }
//        }
//        System.out.printf("Factorial of %d = %d",n,fact);

        // Question 6
//        System.out.println("Repeat the Entered number : ");
//        int n = sc.nextInt();
//        int i =n;
//        while (i!=0){
//            System.out.print(n+" ");
//            i--;
//        }


        // Question 7
//        System.out.println("Repeat the number 1");
//        int n = sc.nextInt();
//        int i =n;
//        while (i!=0){
//            System.out.print(1+" ");
//            i--;
//        }

        // Question 9
//        System.out.println("Enter a number a to add it's multiplication table : ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i=1; i<=10; i++) {
//             int mul = n*i;
//             sum += mul;
//        }
//        System.out.printf("Sum of %d 's multiplication table = %d",n,sum);

        // Question 11
        System.out.println("Enter a number to repeat using for loop : ");
        int n = sc.nextInt();
        System.out.println("How many times u want to repeat...?? : ");
        int rpt = sc.nextInt();
        for (int i=0; i<rpt; i++){
            System.out.printf(n + " ");
        }

    }
}
