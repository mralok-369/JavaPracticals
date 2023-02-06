package com.company.codewithharry;

class Phone{
    public void showtime(){
        System.out.println("Time is 8 pm");
    }
    public void On(){
        System.out.println("Turning on phone......!!");
    }
}
class SmartPhone extends Phone{
    public void playMusic(){
        System.out.println("playing music...!!");
    }
    public void On(){
        System.out.println("Turning on smartphone......!!");
    }
}
public class oops8_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone(); // allowed
//        obj.name();
//        SmartPhone smobj = new SmartPhone(); // allowed
        Phone obj = new SmartPhone(); // allowed
//        SmartPhone obj2 = new Phone(); // not allowed
        obj.showtime();
        obj.On();
//        obj.playMusic(); // not allowed
    }
}
