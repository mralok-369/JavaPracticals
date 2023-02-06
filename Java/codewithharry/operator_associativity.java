package com.company.codewithharry;
import java.util.Scanner;

public class operator_associativity {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        //        Precedence & Associativity

        int a = 6*5-34/2;
        /*
        highest precedence goes to * and / they are then evaluated on the basis of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        int b = 60/5-34*2;
        /*
            =12-34*2
            =12-68
            =-56
         */
        System.out.println(a);
        System.out.println(b);
        //  Quick quiz 1
        int x = 6;
        int y = 4;
        int z = 1;

//        int k = x * y/2;
//        int k = x * (y/2);
//        int k = (x*y)/2;

        int k = (y*y - 4*x*z)/2*x;
        System.out.println(k);
    }
}
