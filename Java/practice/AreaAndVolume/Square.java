package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        double a = sc.nextDouble();
        double area = a*a;
        System.out.println("Area of square is : "+area);
    }
}
