package com.company.practice.AreaAndVolume;

import java.util.Scanner;

public class Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the triangle : ");
        double a = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*(a*a);
        System.out.println("Area of the triangle is : "+area);
    }
}
