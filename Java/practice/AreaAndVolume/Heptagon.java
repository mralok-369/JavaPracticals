package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Heptagon {
    public static void main(String[] args) {
        int side,perimeter;
        float apothem,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the side : ");
        side = sc.nextInt();
        System.out.println("Enter the value of the apothem : ");
        apothem = sc.nextFloat();
        perimeter = 7*side;
        area = (perimeter*apothem)/2;
        System.out.println("Area of Heptagon is : " + area);
    }
}
