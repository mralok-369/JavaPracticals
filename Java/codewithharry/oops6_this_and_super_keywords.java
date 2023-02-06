package com.company.codewithharry;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    EkClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("Mai ek constructor hu");
    }
}
public class oops6_this_and_super_keywords {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
//        System.out.println(e.getA());
        DoClass d = new DoClass(5);

    }
}
