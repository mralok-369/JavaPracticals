package com.company.codewithharry;
/* abstract class is not a class it is a imagination of making class with
    concrete class or make another abstract class */
abstract class Parent2{
    public Parent2() {
        System.out.println("I'm base 2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class oops9_abstract_class_and_methods {
    public static void main(String[] args) {
//        Parent2 p = new Parent2() ;  // cannot make a class of parent class
        Child2 c = new Child2();
        c.greet();
        c.greet2();
//        Child3 c3 = new Child3();  // cannot make a class because it is a abstract class
    }
}
