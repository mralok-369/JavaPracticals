package com.company.codewithharry;

// Question 1 & 2 & 3 class
class GreetM extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Good morning");
        }
    }
}
class GreetW extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Welcome");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ch13_practice_set {
    public static void main(String[] args) {
        // Question 1 & 2
        GreetM gm = new GreetM();
        GreetW gw =new GreetW();
        gm.setPriority(6);
        gw.setPriority(9);
        System.out.println(gm.getPriority());
        System.out.println(gw.getPriority());
//        System.out.println(gw.setPriority());
        gm.start();
        gw.start();

    }
}
