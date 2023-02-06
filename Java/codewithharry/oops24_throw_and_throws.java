package com.company.codewithharry;
class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative..!!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative..!!";
    }
}
public class oops24_throw_and_throws  {
    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // made by harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // shivam -> uses divide function created by harry
//        try {
//            int c = divide(6,0);
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }

        try {
            double ar = area(6);
            System.out.println(ar);
        } catch (Exception e){
            System.out.println("e");
        }

    }
}
