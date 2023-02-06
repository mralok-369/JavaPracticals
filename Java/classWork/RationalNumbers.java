package com.company.classWork;

import java.util.ArrayList;
import java.util.Formatter;
abstract class Employee2 {
    private final String ID;
    private String name;
    private String salary;
    private int age;
    private String speciality;
    public Employee2(String id, String name, String sal, int age,String spc)
    {
        ID = id;
        this.name = name;
        this.salary = sal;
        this.age = age;
        this.speciality = spc;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
    public String getSpeciality() {
        return speciality;
    }
    public abstract void getDetails();
}
class Doctor extends Employee2 {
    public Doctor(String id, String name, String sal , int age,String spc) {
        super(id, name, sal, age, spc);
    }
    public void getDetails() {
        System.out.println(this.toString());
    }
    public String toString() {
        return "ID: " + this.getID() +
                "\nName: " + this.getName() +
                "\nAge: " + this.getAge() + "y" +
                "\nSalary: " + this.getSalary() +
                "\nSepeciality: " + this.getSpeciality();
    }
}
class Nurse extends Employee2{
    public Nurse(String id, String name, String sal, int age, String spc) {
        super(id, name, sal, age, spc);
    }

    public void getDetails() {
        System.out.println(this.toString());
    }
    public String toString() {
        return "ID: " + this.getID() +
                "\nName: " + this.getName() +
                "\nAge: " + this.getAge() + "y" +
                "\nSalary: " + this.getSalary() +
                "\nSepeciality: " + this.getSpeciality();
    }
}
class Administrator{
    ArrayList<Doctor> docArr = new ArrayList<>();
    ArrayList<Nurse> nurseArr = new ArrayList<>();
    ArrayList<Employee2> empArr = new ArrayList<>();
    public void addEmployee(Employee2 member) {
        if(member.getID().charAt(0)=='D') {
            docArr.add((Doctor) member);
            empArr.add(member);
        }else if(member.getID().charAt(0)=='N'){
            nurseArr.add((Nurse) member);
            empArr.add(member);
        }
    }
    public void getDoctorList() {
        System.out.println("Doctors List");
        Formatter fmt = new Formatter();
        fmt.format("%-14s %-7s %-14s %-7s %-15s\n", "Name", "Age",
                "Department","ID","Salary");
        for(Doctor doctor: docArr) {
            fmt.format("%-14s %-7s %-14s %-7s %-15s\n", doctor.getName(),
                    doctor.getAge(),
                    doctor.getSalary(),doctor.getID(),doctor.getSalary());
        }
        System.out.println(fmt);
    }
    public void getNurseList() {
        System.out.println("Nurses List");
        Formatter fmt = new Formatter();
        fmt.format("%-14s %-7s %-14s %-7s %-15s\n", "Name", "Age",
                "Department","ID","Salary");
        for(Nurse nurse: nurseArr) {
            fmt.format("%-14s %-7s %-14s %-7s %-15s\n", nurse.getName(),
                    nurse.getAge(),
                    nurse.getSalary(),nurse.getID(),nurse.getSalary());
        }
        System.out.println(fmt);
    }
    public void getEmployeeList() {
        System.out.println("EMployees List");
        Formatter fmt = new Formatter();
        fmt.format("%-14s %-7s %-14s %-7s %-15s\n", "Name", "Age",
                "Department","ID","Salary");
        for(Employee2 employee: empArr) {
            fmt.format("%-14s %-7s %-14s %-7s %-15s\n",
                    employee.getName(), employee.getAge(),
                    employee.getSalary(),employee.getID(),employee.getSalary());
        }

        System.out.println(fmt);
    }
}
public class RationalNumbers {
    public static void main(String[] args) {
        Employee2 [] empArr = new Employee2[5];
        empArr[0] = new Doctor("D001", "Dr. Doc_1", "1,05,000", 69,
                "Orthopedics");
        empArr[1] = new Nurse("N001", "Ms. Nurse_1", "25,000", 30,
                "Officer/Staff");
        empArr[2] = new Doctor("D002", "Dr. Doc_2", "75,000", 40, "Medicine");
        empArr[3] = new Nurse("N002", "Ms. Nurse_2", "25,000", 30,
                "Officer/Staff");
        Administrator admin = new Administrator();
        admin.addEmployee((Doctor)empArr[0]);
        admin.addEmployee((Nurse)empArr[1]);
        admin.addEmployee((Doctor)empArr[2]);
        admin.addEmployee((Nurse)empArr[3]);
        admin.getEmployeeList();
        admin.getDoctorList();
        admin.getNurseList();
        System.out.println("\nIndividual Employee\n");
        System.out.println(empArr[0] + "\n");
        System.out.println(empArr[1] + "\n");
    }
}