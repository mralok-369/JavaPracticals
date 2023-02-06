package com.company.codewithharry;

public class method_overloading {
    // methods overloading
    static void foo(){
        System.out.println("Good morning bro!!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!!");
    }
    static void foo(int b,int c){
        System.out.println("Good morning " + c*b + " bro!!");
    }
    // change methods
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        // case 1 : changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value after calling change : "+ x);

        // case 2 : changing the array
//        int [] marks = {52,73,77,95,92};
//        change2(marks);
//        System.out.println("The value after calling change2 : " + marks[0]);

        // method overloading
        foo();
        foo(3000);
        foo(50,80); // arguments are actual which we are passing to a function
    }
}
