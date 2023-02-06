package com.company.classWork;
import java.util.Scanner;

public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        int r = sc.nextInt();
        float area = (float) (Math.PI*r*r);
        float circumference = (float) (2*Math.PI*r);
        System.out.println("Area = "+ area);
        System.out.println("Circumference = "+ circumference);
    }
}
