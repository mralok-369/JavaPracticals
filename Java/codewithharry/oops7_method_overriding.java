package com.company.codewithharry;

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I'm method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I'm method 2 of class B");
    }
    public void meth3(){
        System.out.println("I'm method 3 of class B");
    }
}
public class oops7_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
