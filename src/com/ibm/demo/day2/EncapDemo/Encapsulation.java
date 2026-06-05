package com.ibm.demo.day2.EncapDemo;

public class Encapsulation {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Golu");
        emp.setSalary(50000);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }
}