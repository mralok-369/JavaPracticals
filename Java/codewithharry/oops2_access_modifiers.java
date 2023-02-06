package com.company.codewithharry;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
}
public class oops2_access_modifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;    // throws an error due to private access modifiers
//        harry.name = "codeWithHarry";
        harry.setId(45);
        System.out.println(harry.getId());
        harry.setName("codeWithHarry");
        System.out.println(harry.getName());
    }
}
