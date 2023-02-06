package com.company.practice.AreaAndVolume;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trapezoid {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double l1,l2,height;
        System.out.println("Enter the length of two parallel sides and the height of the trapezium : ");
        try {
            l1 = Double.parseDouble(br.readLine());
            l2 = Double.parseDouble(br.readLine());
            height = Double.parseDouble(br.readLine());
        } catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if (l1<=0 || l2<=0 || height<=0){
            System.out.println("Wrong input");
        }
        System.out.println("Area = "+(l1+l2)*height/2);
    }
}
