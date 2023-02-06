package com.company.codewithharry;
// Problem 1 & 3 class
class Circle1{
int r;
    Circle1(int r) {
        this.r = r;
    }
    public void area(){
    System.out.println("area = " + 3.14*r*r);
}
public void perimeter(){
    System.out.println("area = " + 3.14*2*r);
}
}
class Cylinder1 extends Circle1{
    int h;
    Cylinder1(int r,int h) {
        super(r);
        this.h = h;
    }
    public void volume(){
        System.out.println("volume = "+ 3.14*r*r*h);
    }
    public void surfaceArea(){
        System.out.println("Area = "+ 6.28*r*(h+r));
    }
}
// Problem 2 & 4 class
class Rectangle1{
    int height;
    int width;
    // constructor
    Rectangle1(int h,int w){
        this.height = h;
        this.width = w;
    }
    // height setter
    public void setHeight(int height) {
        this.height = height;
    }
    // width setter
    public void setWidth(int width) {
        this.width = width;
    }
    // height getter
    public int getHeight() {
        return height;
    }
    // width getter
    public int getWidth() {
        return width;
    }
    // rec area
    public void area(){
        System.out.println("area = "+ height*width);
    }
    // rec perimeter
    public void perimeter(){
        System.out.println("perimeter = "+ 2*(height+width));
    }
}
class Cuboid extends Rectangle1{
    int length;
    // constructor
    Cuboid(int h,int w,int l){
        super(h,w);
        this.length = l;
    }
    // length setter
    public void setLength(int length) {
        this.length = length;
    }
    // length getter
    public int getLength() {
        return length;
    }
    // cube volume
    public void volume(){
        System.out.println("Volume = "+ height*width*length);
    }
    // cube perimeter
    public void periMeter(){
        System.out.println("perimeter = "+ 4*(height+width+length));
    }
}
public class ch10_practice_set {
    public static void main(String[] args) {
        // Problem 1 & 3
        /*
        Circle1 c = new Circle1(3);
        c.area();
        c.perimeter();
        Cylinder1 cl = new Cylinder1(5,4);
        cl.area();
        cl.surfaceArea();
        cl.volume();
         */

        // Problem 2 & 4
        Rectangle1 rec = new Rectangle1(4,5);
        rec.perimeter();
        rec.area();
        Cuboid cb = new Cuboid(4,5,6);
        cb.volume();
        cb.periMeter();

    }
}
