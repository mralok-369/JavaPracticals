package com.company.codewithharry;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2();
}
class NewPhoneClass extends Phone{

    @Override
    public void showtime(){
        System.out.println("Time is 8 am");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class adv5_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhoneClass phone = new NewPhoneClass();
        phone.showtime();
        phone.sum(5,6);
    }
}
