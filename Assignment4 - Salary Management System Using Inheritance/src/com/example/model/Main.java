package com.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
//    static Employee[] employeeList = new Employee[100];
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    static String flag;
//    static String name;
//    static int id;
//    static double salary;
//
//    public static void InputData() throws IOException{
//        do {System.out.print("Enter com.example.model.Employee name:");
//        name = br.readLine();
//        System.out.print("com.example.model.Employee id: ");
//        id = Integer.parseInt(br.readLine());
//        System.out.print("com.example.model.Employee type: ");
//        String type = br.readLine();
//        System.out.print("Enter Basic Salary: ");
//        salary = Double.parseDouble(br.readLine());;
//        if (type.equalsIgnoreCase("com.example.model.FullTimeEmployee")){
//            fullTimeEmployee();
//        } else if (type.equalsIgnoreCase("com.example.model.PartTimeEmployee")){
//            partTimeEmployee();
//        } else if (type.equalsIgnoreCase("com.example.model.ContractEmployee")){
//            contractEmployee();
//        }
//            System.out.print("Do you want to add another com.example.model.Employee: ");
//            flag = br.readLine();
//        } while(flag.equalsIgnoreCase("Yes"));
//    }
//    public static void fullTimeEmployee() throws IOException{
//        System.out.print("Enter Allowance: ");
//        double allowance = Double.parseDouble(br.readLine());
//        System.out.print("Enter Bonus: ");
//        double bonus = Double.parseDouble(br.readLine());
//        employeeList[Employee.getEmployeeCount()] = new FullTimeEmployee(name,id,salary,allowance,bonus);
//    }
//    public static void partTimeEmployee() throws IOException{
//        System.out.print("Enter hoursWorked: ");
//        int hoursWorkded = Integer.parseInt(br.readLine());
//        System.out.print("Enter hoursRate: ");
//        double hoursRate = Double.parseDouble(br.readLine());
//        employeeList[Employee.getEmployeeCount()] = new PartTimeEmployee(name,id,salary,hoursWorkded,hoursRate);
//    }
//    public static void contractEmployee() throws IOException{
//        System.out.print("Enter contractDuration: ");
//        int contractDuration = Integer.parseInt(br.readLine());
//        System.out.print("Enter contractAmount: ");
//        double contractAmount = Double.parseDouble(br.readLine());
//        employeeList[Employee.getEmployeeCount()] = new PartTimeEmployee(name,id,salary,contractDuration,contractAmount);
//    }
//    public static void main(String[] args) throws IOException {
//        InputData();
//        display();
//    }
//
//    public static void display(){
//        for (int i = 0; i < Employee.getEmployeeCount(); i++){
//            employeeList[i].displayDetails();
//        }
//    }
}