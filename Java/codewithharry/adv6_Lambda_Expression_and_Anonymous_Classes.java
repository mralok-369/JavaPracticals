package com.company.codewithharry;
@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}

//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//    }
//}
public class adv6_Lambda_Expression_and_Anonymous_Classes {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth 1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("I am meth 2");
//            }
//        };
//        obj.meth1();

        // Lambda expression
//        DemoAno obj = new HarryFunc();
//        obj.meth1();

        DemoAno obj = (a)->{ System.out.println("I am meth from this lambda "+a);};
        obj.meth1(6);
    }
}
