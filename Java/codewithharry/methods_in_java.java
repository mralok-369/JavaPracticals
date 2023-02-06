package com.company.codewithharry;

public class methods_in_java {
    // static function directly call by name and this method is sharable by all the object of the class
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    // if we want to call a function without static then first we have to create an object
    int sub(int x1, int y1){
        int z1;
        if (x1>y1){
            z1 = x1-y1;
        }
        else {
            z1 = y1-x1;
        }
        return z1;
    }
    public static void main(String[] args) {
        /*
        int a =5;
        int b=7;
        int c;
        if (a>b){
            c = a+b;
        }
        else {
            c = (a + b) * 5;
        }
        System.out.println(c);
         */
        int a1 = 15;
        int b1 = 8;

        int c1 = logic(a1,b1); // calling to logic function which is static function
        System.out.println(c1);

        methods_in_java obj = new methods_in_java(); // creating object of sub function
        int s1 = obj.sub(a1,b1); // calling to sub function which is not static
        System.out.println(s1);

    }
}
