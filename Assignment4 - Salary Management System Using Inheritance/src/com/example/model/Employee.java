package com.example.model;

public class Employee {
    private String name;
    private int employeeId;
    private double basicSalary;
    private static int employeeCount;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.employeeId = id;
        this.basicSalary = salary;
        employeeCount++;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary(){
        return basicSalary;
    }

    public void displayDetails(){
        System.out.println("Employee: "+ this.name);
        System.out.println("Employee's ID: " + this.employeeId);
        System.out.println("Basic Salary: "+ this.basicSalary);
        System.out.println("Total Salary: "+ this.calculateSalary());
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
