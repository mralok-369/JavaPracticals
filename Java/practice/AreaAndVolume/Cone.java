package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cone : ");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the cone : ");
        float h = sc.nextFloat();
        float volume = (float) (Math.PI*r*r*h)/3;
        System.out.println("Volume is : "+volume);
    }

}
