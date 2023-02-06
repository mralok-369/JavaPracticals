package com.company.practice.AreaAndVolume;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double l = sc.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double w = sc.nextDouble();
        double area = l*w;
        System.out.println("Area of rectangle is : "+area);
    }
}
