package com.company.codewithharry;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails() {
        System.out.println("My id is "+id);
        System.out.println("and name is "+name);
    }
    public int getSalary() {
        return salary;
    }
}
public class oops1_intro {
    public static void main(String[] args) {
        System.out.println("This is our first custom class !! ");
        Employee harry = new Employee();  // instantiating a new Employee object
        harry.id = 12;
        harry.name = "codeWithHarry";
        harry.salary = 34000;

        Employee john = new Employee();  // instantiating a new Employee object
        john.id = 13;
        john.name = "john tripathi";
        john.salary = 12000;
        // printing the object property
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println("salary : " + salary);
    }
}
