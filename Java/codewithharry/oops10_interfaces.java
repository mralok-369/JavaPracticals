package com.company.codewithharry;
/* biggest different b/w abstract classes and interfaces is this that
we can make a class by using only one abstract class but we make can make
a class using multiple interfaces
 */
// interface we cannot make an object of interface
interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle {
    void blowHornNagin();
    void blowHornKgf();
}
//class make by using interface using implements keyword
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Pee Poo Poo Poo");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying breaks");
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Applying speedup");
    }
    @Override
    public void blowHornKgf() {
        System.out.println("Slam rocky bhai pee pee pee pee");
    }
    @Override
    public void blowHornNagin() {
        System.out.println("mai nagin nagin dance nachna poo poo poo poo");
    }
}
public class oops10_interfaces {
    public static void main(String[] args) {
        AvonCycle ac = new AvonCycle();
        ac.applyBrake(5);
        ac.speedUp(2);
        ac.blowHorn();
        ac.blowHornKgf();
        ac.blowHornNagin();
        // you can create props in interfaces
        System.out.println(ac.a);
        // you cannot modify props in interfaces as they are final
//        ac.a = 5;
        System.out.println(ac.a);
    }
}
