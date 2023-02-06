package com.company.codewithharry;
// Question 1 & 2 & 3 class
class Cylinder {
    private int radius;
    private int height;
    // constructor
    public Cylinder(){
        radius = 4;
        height = 5;
    }
    public Cylinder(int a,int b){
        radius = a;
        height = b;
    }
    // setters and getters of radius and height
    public void setRadius(int r) { radius = r; }
    public int getRadius(){ return radius; }
    public void setHeight(int h) { height = h; }
    public int getHeight(){ return height; }
    // calculate surface area and volume of cylinder
    public double surfaceArea() {
        double sa = 6.18*radius*(height+radius);
        return sa;
    }
    public double volume(){
        double vol = 3.14*radius*radius*height;
        return vol;
    }
}
// Question 4 class
class Rectangles {
    int height;
    int width;

    public Rectangles(){
        height = 13;
        width = 11;
    }
    public Rectangles(int h,int w){
        height = h;
        width = w;
    }
    public void recDetails(){
        System.out.println("Height of rectangle : " + height);
        System.out.println("Width of rectangle : " + width);
    }
}
// Question 5 class
class Sphere {
    private int radius;
    // setters and getters of radius and height
    public void setRadius(int r) { radius = r; }
    public int getRadius(){ return radius; }
    public void volume(){
        System.out.println("Volume of sphere : " + (4/3)*(3.14*radius*radius*radius));
    }
}
public class ch9_practice_set {
    public static void main(String[] args) {

        // Question 1
        Cylinder c1 = new Cylinder();
        c1.setHeight(7);
        c1.setRadius(8);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
        // Question 2
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
        // Question 3
        Cylinder c2 = new Cylinder(2,3);
        System.out.println(c2.getRadius());
        System.out.println(c2.getHeight());
        System.out.println(c2.surfaceArea());
        System.out.println(c2.volume());

        // Question 4
        /*
        Rectangles rec = new Rectangles();
        rec.recDetails();
        Rectangles rec2 = new Rectangles(23,21);
        rec2.recDetails();
        */

        // Question 5
        /*
        Sphere sp = new Sphere();
        sp.setRadius(10);
        System.out.println(sp.getRadius());
        sp.volume();
         */

    }
}
