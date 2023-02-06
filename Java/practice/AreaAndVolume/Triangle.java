package com.company.practice.AreaAndVolume;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the triangle : ");
        double b = sc.nextDouble();
        System.out.println("Enter the height of the triangle : ");
        double h = sc.nextDouble();
        double area = (b*h)/2;
        System.out.println("Area of the triangle is : "+area);
    }
}
