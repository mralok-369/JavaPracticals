package com.company.codewithharry;

public class oops25_finally_block_in_exception {
    public static int greet() {
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Cleaning up resources...This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
//        int k = greet();
//        System.out.println(k);

        int a = 7;
        int b = 9;
        while (true) {
            try {
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            } finally {
                System.out.println("I am finally for value of b "+ b);
            }
            b--;
        }
        // at the place of catch we can use finally but if exception occurs it will give the error
        try {
            System.out.println(5/0);
        } finally {
            System.out.println("Yes i am finally");
        }

    }
}
