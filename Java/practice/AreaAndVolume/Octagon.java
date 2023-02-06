package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Octagon {
    public static void main(String[] args) {
        int side;
        float area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side : ");
        side = sc.nextInt();
        area = (float) (2*(1+Math.sqrt(2))*side*side);
        System.out.println("the area of the octagon is : " + area);
    }
}
