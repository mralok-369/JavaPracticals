package com.company.classWork;
import java.lang.Math;
import java.util.*;

public class mini1 {
    public static void main(String[] args) {
        System.out.println("Input a,b,c,n respectively (n>2)  : ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Scanner B=new Scanner(System.in);
        int b=sc.nextInt();
        Scanner C=new Scanner(System.in);
        int c=sc.nextInt();
        Scanner N=new Scanner(System.in);
        int n=sc.nextInt();

        if ( Math.pow(a, n)+Math.pow(b, n)==Math.pow(c, n) )
        {
            System.out.print("theorem is wrong");

        }
        else {
            System.out.print("theorem is right");

        }
    }
}
