package com.company.practice.AreaAndVolume;
import java.util.Scanner;

public class Hexagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a side of hexagon : ");
        double s = sc.nextDouble();
        System.out.println("The area of hexagon is : "+ hexArea(s)+"\n");
    }
    public static double hexArea(double s){
        return (6*(s*s))/(4*Math.tan(Math.PI/6));
    }
}
