package com.company.practice.AreaAndVolume;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere : ");
        double r = sc.nextDouble();
        double volume = (4*22*r*r*r)/(3*7);
        System.out.println("Volume is : "+volume);
    }
}
