package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Hemisphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the hemisphere : ");
        float r = sc.nextFloat();
        float volume = (float) (2*Math.PI*r*r*r)/3;
        System.out.println("Volume is : "+volume);
    }
}
