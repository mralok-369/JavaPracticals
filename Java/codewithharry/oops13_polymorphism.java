package com.company.codewithharry;
interface MyCamera2{
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
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
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
    public void sampleMeth(){
        System.out.println("meth");
    }
}

public class oops13_polymorphism {
    public static void main(String[] args) {
        // this is a smartphone but use it as a camera
        MyCamera2 cam1 = new MySmartPhone2(); // dynamic method dispatch
//        cam1.getNetwork():  // not allowed it can use only camera function
//        cam1.sampleMeth();  // also not allowed
        cam1.recordVideo();

        MyWifi2 wifi = new MySmartPhone2(); // this is a smartphone but use it as a wifi

    }
}
// in this program smartphone is example of polymorphism because it can used as camera wifi etc