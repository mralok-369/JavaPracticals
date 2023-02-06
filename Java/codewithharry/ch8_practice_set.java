package com.company.codewithharry;
import java.util.Scanner;

// Question 1 class
class Emp {
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
// Question 2 class
class CellPhone {
    public void Ringing(){
        System.out.println("The cellphone is ringing.");
    }
    public void Vibrating(){
        System.out.println("The cellphone is vibrating.");
    }
    public void Calling(){
        System.out.println("Calling to your bestii");
    }
}
// Question 3 class
class Square {
    int side;

    public void getArea(){
        System.out.println("The area of square is : " + side*side);
    }
    public void getPerimeter(){
        System.out.println("The perimeter of square is : " + 4*side);
    }
}
// Question 4 class
class Rectangle {
    int height;
    int width;

    public void getArea(){
        System.out.println("The area of rectangle is : " + height*width);
    }
    public void getPerimeter(){
        System.out.println("The perimeter of rectangle is : " + 2*(height+width));
    }
}
// Question 5 class
class TommyVecetti {
    public void hitting(){
        System.out.println("TommyVecetti is Hitting..!!");
    }
    public void running(){
        System.out.println("TommyVecetti is running..!!");
    }
    public void firing(){
        System.out.println("TommyVecetti is fireing..!!");
    }
}
// Question 6 class
class Circle {
    int radius;

    public void getArea(){
        System.out.println("The area of circle : " + 3.14*radius*radius);
    }
    public void getPerimeter(){
        System.out.println("The perimeter of circle : " + 2*3.14*radius);
    }
    public void getDiameter(){
        System.out.println("The diameter of circle : " + 2*radius);
    }
}

public class ch8_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        /*
        Emp harry = new Emp();
        harry.setName("codeWithHarry");
        System.out.println(harry.getName());
        harry.salary = 22000;
        System.out.println(harry.getSalary());
        */

        // Question 2
        /*
        CellPhone asus = new CellPhone();
        asus.Ringing();
        asus.Vibrating();
        asus.Calling();
        */

        // Question 3
        /*
        Square sq = new Square();
        sq.side = 10;
        sq.getArea();
        sq.getPerimeter();
        */

        // Question 4
        /*
        Rectangle rq = new Rectangle();
        rq.height = 12;
        rq.width = 8;
        rq.getArea();
        rq.getPerimeter();
        */

        // Question 5
        /*
        TommyVecetti tom = new TommyVecetti();
        tom.running();
        tom.hitting();
        tom.firing();
        */

        // Question 6
        Circle c1 = new Circle();
        c1.radius = 8;
        c1.getDiameter();
        c1.getArea();
        c1.getPerimeter();
    }
}
