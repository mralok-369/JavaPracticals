package com.company.codewithharry;

class Base {
    int x;
    public void setX(int x) { this.x = x; }
    public int getX() { return x; }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}
class Derived extends Base {
    int y;
    public void setY(int y) { this.y = y; }
    public int getY() { return y; }
}
public class oops4_inheritance {
    public static void main(String[] args) {
        // object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        b.printMe();
        // object of derived class
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(15);
        System.out.println(d.getY());
        d.printMe();
    }
}
