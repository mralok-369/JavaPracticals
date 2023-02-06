package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Pentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side : ");
        int side = sc.nextInt();
        float area = (float) (Math.sqrt(5*(5+2*Math.sqrt(5)))*side*side)/4;
        System.out.println("Area of Pentagon is : "+ area);
    }
}
