package com.company.codewithharry;

//import java.util.Scanner;
//import java.util.*;
class C{
    int i;
    C(int a){
        i = a;
    }
}
public class oops14_packages {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input "+ a);
    }
}
