package com.company.codewithharry;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void meth1() {
        System.out.println("i'm meth1");
    }
    @Override
    public void meth2() {
        System.out.println("i'm meth2");
    }
    @Override
    public void meth3() {
        System.out.println("i'm meth3");
    }
    @Override
    public void meth4() {
        System.out.println("i'm meth4");
    }
}
public class oops12_inheritance_in_interfaces {
    public static void main(String[] args) {
        MySampleClass msc = new MySampleClass();
        msc.meth1();
        msc.meth2();
        msc.meth3();
        msc.meth4();
    }
}
