package com.company.codewithharry;
class MyThreads1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while (i<40000){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThreads2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class oops16_threads {
    public static void main(String[] args) {
        MyThreads1 t1 = new MyThreads1();
        MyThreads2 t2 = new MyThreads2();
        t1.start();
        t2.start();
    }
}
