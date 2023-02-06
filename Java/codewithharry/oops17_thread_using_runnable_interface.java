package com.company.codewithharry;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<5000; i++){
            System.out.println("I am a thread 1 not a threat1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int j=0; j<5000; j++){
            System.out.println("I am a thread 2 not a threat2");
        }
    }
}
public class oops17_thread_using_runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
