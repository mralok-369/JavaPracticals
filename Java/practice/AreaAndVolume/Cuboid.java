package com.company.practice.AreaAndVolume;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the cuboid : ");
        float l = sc.nextFloat();
        System.out.println("Enter the breath of the cuboid : ");
        float b = sc.nextFloat();
        System.out.println("Enter the height of the cuboid : ");
        float h = sc.nextFloat();
        float volume = (float) (l*b*h);
        System.out.println("Volume is : "+volume);
    }
}
