package com.company.classWork;
import java.lang.Math;
public class mini2 {
    static void isRight(int x1, int y1, int x2,
                          int y2, int x3, int y3)
    {
        float s1 = (float) (Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        float s2 = (float) (Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2)));
        float s3 = (float) (Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2)));
        float area = (float) (s1*s2)/2;
        if (Math.pow(s1,2)+Math.pow(s2,2) == Math.pow(s3,2)){
            System.out.println("right triangle ");
            System.out.println("area =  "+area);
        }
        else
            System.out.println("Points not form a triangle");
    }

    public static void main(String[] args) {
        int x1 = -3, x2 = 2, x3 = -6,
                y1 = -4, y2 = 6, y3 = 10;
        isRight(x1, y1, x2, y2, x3, y3);
    }
}
