package com.company.codewithharry;

class MyMainEmployee{
    private int id;
    private String name;
    // constructor without passing arguments
    public MyMainEmployee(){
        id = 45;
        name = "Your-name-here";
    }
    // constructor with passing arguments
    public MyMainEmployee(int n,String nm){
        id = n;
        name = nm;
    }
    public void setName(String n) { name = n; }
    public String getName() { return name; }
    public void setId(int i) { id = i; }
    public int getId() { return id; }
}
public class oops3_constructors {
    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee(55,"Harry bhai");
        MyMainEmployee harry = new MyMainEmployee();
//        harry.setName("codeWithHarry");
//        harry.setId(34);

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
