package com.company.codewithharry;

// Question 1 class
abstract class Pen{
    abstract void write();
    abstract void refill();
}
// Question 2 class
class FountainPen extends Pen {
    @Override
    void write() {
        System.out.println("Writing....");
    }
    @Override
    void refill() {
        System.out.println("Filling ink....");
    }
    public void changeNib(){
        System.out.println("Changing the nib");
    }
}
// Question 3 class
class Monkey{
    public void jump(){
        System.out.println("Monkey jumps");
    }
    public void bite(){
        System.out.println("Monkey bites");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements basicAnimal{
    @Override
    public void eat() {
        System.out.println("eating....");
    }
    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
    public void speak(){
        System.out.println("Hello sir..!!");
    }
}
// Question 4 & 5 class
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelePhone extends TelePhone{
    @Override
    void ring() {
        System.out.println("Ringing...");
    }
    @Override
    void lift() {
        System.out.println("Lifting....");
    }
    @Override
    void disconnect() {
        System.out.println("Disconnecting.....");
    }
    public void wifi(){
        System.out.println("Connecting to wifi.....");
    }
    public void calculator(){
        System.out.println("Using Calculator.......");
    }
}
// Question 6 & 7 class
interface TvRemote {
    void switchOn();
    void switchOff();
}
interface SmartTvRemote extends TvRemote {
    void openYoutube();
    void connectMobile();
}
class TV implements SmartTvRemote {
    @Override
    public void switchOn() {
        System.out.println("Switching on the TV..");
    }
    @Override
    public void connectMobile() {
        System.out.println("Connecting to mobile...");
    }
    @Override
    public void openYoutube() {
        System.out.println("Opening youtube....");
    }
    @Override
    public void switchOff() {
        System.out.println("Switching off the TV.....");
    }
}
public class ch11_practice_set {
    public static void main(String[] args) {
        // Question 1 & 2
        /*
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
         */

        // Question 3
        /*
        Human h = new Human();
        h.jump();
        h.bite();
        h.speak();
        h.eat();
        h.sleep();
         */

        // Question 4
        // take smartTelePhone but use as a telephone example of polymorphism
        /*
        TelePhone tp = new SmartTelePhone(); // dynamic method dispatch
        tp.ring();
        tp.lift();
        tp.disconnect();
//        tp.calculator();  // not allowed
         */

        // Question 5
        /*
        // take human but use as a monkey example of polymorphism
        Monkey m = new Human(); // dynamic method dispatch
        m.bite();
        m.jump();
         */

        // Question 6 & 7
        TV t = new TV();
        t.switchOn();
        t.connectMobile();
        t.openYoutube();
        t.switchOff();

    }
}
