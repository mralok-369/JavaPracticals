package com.company.classWork;
import java.util.Scanner;

class StringMethods {
    Scanner sc = new Scanner(System.in);
    private String s1 = new String();
    private String s2 = new String();
    // method for printing String
    public void printStr(){
        System.out.println("Enter a String : ");
        s2 = sc.nextLine();
        System.out.println(s2);
    }
    // method to find char at given index
    public void charAt(){
        System.out.println("Enter a string : ");
        s1 = sc.nextLine();
        System.out.println("Enter index no to find char :");
        int index = sc.nextInt();
        char c = s1.charAt(index);
        System.out.printf("Char at index %d is : %c\n",index,c);
    }
    // method for compare two string
    public void compareTo(){
        System.out.println("Enter first string : ");
        s1 = sc.nextLine();
        System.out.println("Enter second string which will compared with: ");
        s2 = sc.nextLine();
        int out = s1.compareTo(s2);
        System.out.println(out);
    }
    // method to concatenate two strings
    public void concate(){
        System.out.println("Enter first string : ");
        s1 = sc.nextLine();
        System.out.println("Enter second string : ");
        s2 = sc.nextLine();
        String output = s1.concat(s2);
        System.out.println(output);
    }
    // method to check two strings equal or not
    public void equals(){
        System.out.println("Enter first string : ");
        s1 = sc.nextLine();
        System.out.println("Enter second string : ");
        s2 = sc.nextLine();
        boolean ans =  s1.equals(s2);
        System.out.println(ans);
    }
    // method to check two strings equal or not ignore case
    public void equalIgnoreCase(){
        System.out.println("Enter first string : ");
        s1 = sc.nextLine();
        System.out.println("Enter second string : ");
        s2 = sc.nextLine();
        System.out.println(s1.equalsIgnoreCase(s2));
    }
    // method to find string length
    public void length(){
        System.out.println("Enter a string to find i's length : ");
        s1 = sc.nextLine();
        System.out.println(s1.length());
    }
    // method to replace old char with new char
    public void replace(){
        System.out.println("Enter a string : ");
        s1 = sc.nextLine();
        System.out.println("Enter old char : ");
        char c = sc.next().charAt(0);
        System.out.println("Enter new char : ");
        char n = sc.next().charAt(0);
        System.out.println(s1.replace(c,n));
    }
    // method to find substring from a given string
    public void subString(){
        System.out.println("Enter a string : ");
        s1 = sc.nextLine();
        System.out.println("Enter start index : ");
        int start = sc.nextInt();
        System.out.println("Enter end index : ");
        int end = sc.nextInt();
        System.out.println(s1.substring(start,end));
    }
}
public class que11 {

    public static void main(String[] args) {
        StringMethods name = new StringMethods();
//        name.printStr();
//        name.charAt();
//        name.compareTo();
//        name.concate();
//        name.equals();
//        name.equalIgnoreCase();
//        name.length();
//        name.replace();
        name.subString();
    }
}
