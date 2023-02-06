package com.company.codewithharry;
import java.util.ArrayList;

class MyGeneric<T1>{
    int val = 344;
    private T1 t1;

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T1 getT1() {
        return t1;
    }

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}
public class adv7_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("str1");
        arrayList.add(554);
        arrayList.add(451);
//        arrayList.add(new Scanner(System.in));
        int a = (int) arrayList.get(1);
//        System.out.println(a);
        MyGeneric<String> g1 = new MyGeneric(23,"MyString is a string");
        String str = g1.getT1();
        System.out.println(str);

    }
}
