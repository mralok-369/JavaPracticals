package com.company.codewithharry;
import java.util.Scanner;

public class arrays_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays = collection of homogeneous data types and data stored in contigeous manner
        // three way to create an array
        //1st way of creating
//        int [] marks = new int[5];   // -> declaration+memory allocation
        //  2nd way
//        int [] marks;  // -> Declaration
//        marks = new int[5];   // -> memory allocation
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 70;
//        marks[3] = 90;
//        marks[4] = 86;
//        System.out.println(marks[4]);

        // 3rd way
//        int [] mark = {100,70,80,52,56,85,63,71,98}; // -> declaration, memory allocation and initialization

        // array length method
//        System.out.println(marks.length);
//        System.out.println(mark.length);

        // displaying an array

//        for (int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }
//        for (int i=0; i<mark.length; i++){
//            System.out.print(mark[i]+" ");
//        }

//        float [] marks = {98.5f,45.5f,79.5f,99.5f,88.5f};
//        String [] students = {"Harry","Rohan","Shubham","Alok","Lovish"};

        // display the array in reverse order
//        for (int j=marks.length-1; j>=0; j--){
//            System.out.print(marks[j] + " ");
//        }
//        for (int j=students.length-1; j>=0; j--){
//            System.out.print(students[j] + " ");
//        }

        // for-each loop in java
//        System.out.println("Printing using for-each loop : ");
//        for(float element: marks){
//            System.out.println(element);
//        }


        // multi-dimensional array
        int [][] flats = new int[2][3];
        flats[0][0] = 100;
        flats[0][1] = 101;
        flats[0][2] = 102;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println("Printing 2-D array : ");
        for (int i=0; i<flats.length; i++){
            for (int j=0; j<flats[i].length; j++ ){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        String [][] std = new String[2][3];  //= {"Harry","Alok","Vishal","Larry","kathi","Perry"};
        System.out.println("Enter 6 values of 2-D arrays : ");
        for (int i=0; i< std.length; i++){
            for (int j=0; j<std[i].length; j++){
                std[i][j] = sc.next();
            }
        }
        System.out.println("Printing 2-D array : ");
        for (int i=0; i<std.length; i++){
            for (int j=0; j<std[i].length; j++ ){
                System.out.print(std[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
