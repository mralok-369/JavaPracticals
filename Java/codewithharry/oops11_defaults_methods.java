package com.company.codewithharry;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    // private method
    private void greet(){
        System.out.println("Good morning");
    }
    // default method
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    @Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }
    // we can override default method in implemented class
//    @Override
//    public void record4kVideo() {
//        System.out.println("Recording in 4k full hd...");
//    }
    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Alok","Harry","Vishal"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}
public class oops11_defaults_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
//        ms.greet();   // throws an error because it's a private method
        String[] ar = ms.getNetwork();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}
