package com.company.classWork;
import java.util.*;
public class mini4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int size=sc.nextInt();
        int [] cart=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter "+(i+1)+"element :");
            cart[i]=sc.nextInt();
        }
        int choice;
        System.out.println("Enter 1 for insertion, 2 for deletion and 3 for searching element ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                int pos,num;
                System.out.println("enter position of insertion :");
                pos=sc.nextInt();
                System.out.println("enter number to be inserted :");
                num=sc.nextInt();
                for(int i=size;i>pos;i--)
                {
                    cart[i]=cart[i-1];
                }
                cart[pos]=num;
                size++;
                System.out.println("After Insertion :");
                for(int i=0;i<size;i++)
                {
                    System.out.println(cart[i]);
                }
                break;
            case 2:
                int del,flag=0,loc=0;
                System.out.println("enter number to be deleted :");
                del=sc.nextInt();
                for(int i=0;i<size;i++)
                {
                    if(cart[i]==del)
                    {
                        flag=1;
                        loc=i;
                        break;
                    }
                    else{
                        flag=0;
                    }
                }
                if(flag==1)
                {
                    for(int i=loc+1;i<size;i++)
                    {
                        cart[i-1]=cart[i];
                    }
                    System.out.println("after deleting :");
                    for(int i=0;i< size-2;i++)
                    {
                        System.out.print(cart[i]+" , ");
                    }
                    System.out.print(cart[size-2]);
                }
                else
                {
                    System.out.println("element not found");
                }

                break;
            case 3:
                System.out.println("enter element to be searched :");
                int n=sc.nextInt();
                for(int i=0;i<size;i++)
                {
                    if(cart[i]==n)
                    {
                        System.out.println("element found at "+(i+1)+" position");
                    }
                    else
                        System.out.println("element not found");
                }
                break;
            default :
                System.out.println("Enter valid opration");
        }
    }
}