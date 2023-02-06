package com.company.classWork;

class RationalNumber {
    int num;  // numerator
    int denum;  // denominator

    // constructor
    public RationalNumber(){
        this.num = num;
        this.denum = denum;
    }
    public RationalNumber(int n,int m){
        this.num = n;
        this.denum = m;
    }

    public void toString(int num, int denum){
        if(denum == 1){
            System.out.println(num + "");
        }
        else {
            System.out.println(num + "/" + denum);
        }
    }
    public void addNum(RationalNumber p,RationalNumber q){
        int num1 = ((p.num * q.denum) + (q.num * p.denum));
        int denum1 = p.denum * q.denum;
        toString(num1,denum1);
    }
    public void subtract(RationalNumber p,RationalNumber q){
        int num1 = ((p.num * q.denum) - (q.num * p.denum));
        int denum1 = p.denum * q.denum;
        toString(num1,denum1);
    }
    public void multiply(RationalNumber p,RationalNumber q){
        int num1 = p.num * q.num;
        int denum1 = p.denum * q.denum;
        toString(num1,denum1);
    }
    public void division(RationalNumber p,RationalNumber q){
        int num1 = p.num * q.denum;
        int denum1 = p.denum * q.num;
        toString(num1,denum1);
    }
    public void reciprocal(RationalNumber p){
        int num1 = p.denum;
        int denum1 = p.num;
        toString(num1,denum1);
    }
    public int gcd(RationalNumber p){
        int x = p.num;
        int y = p.denum;
        int r;
        while (y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
    public void lowestForm(RationalNumber p){
        int gcd = gcd(p);
        int num1 = p.num/gcd;
        int denum1 = p.denum/gcd;
        toString(num1,denum1);
    }
    public void isEqualTo(RationalNumber p,RationalNumber q){
        int gcd1 = gcd(p);
        int gcd2 = gcd(q);
        if(p.num/gcd1 == q.num/gcd2 && p.denum/gcd1 == q.denum/gcd2){
            System.out.println("Rational");
        }
        else {
            System.out.println("Not Rational");
        }
    }
}
public class que14 {
    public static void main(String[] args) {
        RationalNumber x = new RationalNumber(1,2);
        RationalNumber y = new RationalNumber(2,3);
        RationalNumber res = new RationalNumber();
//        res.addNum(x,y);
//        res.subtract(x,y);
//        res.multiply(x,y);
//        res.division(x,y);
//        res.reciprocal(y);
        RationalNumber z = new RationalNumber(24,30);
//        System.out.println("GCD : " + res.gcd(z));
//        res.lowestForm(z);
        RationalNumber p = new RationalNumber(24,30);
        RationalNumber q = new RationalNumber(36,45);
        res.isEqualTo(p,q);
    }
}
