package com.company.classWork;
import java.util.*;

public class mini3 {
    public static void main(String[] args) {
        int ar1[]=new int[4];
        int ar2[]=new int[4];
        int inner[][]=new int[4][4];
        int outer=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array 1: ");
        for(int i=0;i<4;i++)
        {
            ar1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the array 2: ");
        for(int i=0;i<4;i++)
        {
            ar2[i]=sc.nextInt();
        }

        System.out.println("Inner product of the two arrays : ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                inner[i][j]=ar1[i]*ar2[j];
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(inner[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<4;i++)
        {
            outer+=ar1[i]*ar2[i];
        }
        System.out.println("Outer product of the two arrays : "+outer);
    }
}
