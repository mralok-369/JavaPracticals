package com.company.codewithharry;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("thank you");
//        while (true){
//            System.out.println("i am a thread");
//        }
    }
}
public class oops18_constructor_from_thread_class {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("harry");
        MyThr t2 = new MyThr("Ram chandra");
        t1.start();
        t2.start();
        System.out.println("the id of the thread t1 is " + t1.getId());
        System.out.println("the id of the thread t1 is " + t1.getName());
        System.out.println("the id of the thread t2 is " + t2.getId());
        System.out.println("the id of the thread t2 is " + t2.getName());
    }
}
