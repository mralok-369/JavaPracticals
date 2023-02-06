package com.company.codewithharry;
import java.util.Locale;
import java.util.Scanner;

public class strings_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String name = new String("Harry");
//        String name = "Alok";
//        System.out.print("The name is : ");
//        System.out.println(name);

//        int a = 6;
//        float b = 5.6532f;
//        System.out.printf("The value of a id %d and value of b is %f",a,b);
//        System.out.format("The value of a id %d and value of b is %f",a,b);

//        String st = sc.next(); // next() only take first word of sentence
//        String st = sc.nextLine();
//        System.out.println(st);


        // Methods in string
        String name = "Alok Kumar";

//        int strlen = name.length();
//        System.out.println(strlen);
//
//        String lstring = name.toLowerCase();
//        System.out.println(lstring);
//
//        String ustring = name.toUpperCase();
//        System.out.println(ustring);

//        String nonTrimmedString = "     Alok    ";
//        System.out.println(nonTrimmedString);

//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(5));
//        System.out.println(name.substring(2,7));

//        String replaceString = name.replace('o','e');
//        String replaceString = name.replace("ok","ex");
//        System.out.println(replaceString);

//        System.out.println(name.startsWith("Al"));
//        System.out.println(name.startsWith("mr"));
//        System.out.println(name.endsWith("ar"));

//        System.out.println(name.charAt(3));

//        System.out.println(name.indexOf("k"));
//        System.out.println(name.indexOf("k",3));
//        System.out.println(name.lastIndexOf("r"));
//        System.out.println(name.lastIndexOf("ok",4));

        System.out.println(name.equals("Alok Kumar"));
        System.out.println(name.equalsIgnoreCase("alOK"));

        System.out.println("I am escape sequence \" double quote ");

    }
}
