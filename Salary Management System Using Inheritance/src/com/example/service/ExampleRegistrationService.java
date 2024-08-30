package com.example.service;

import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.FullTimeEmployee;
import com.example.model.PartTimeEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleRegistrationService {

    public Employee[] employeeList = new Employee[100];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private int id;
    private double salary;
    private String type;

    public Employee getEmployeesInfo() throws IOException {
        String flag;
        do {
            commonEmployeeInfo();
            if (type.equalsIgnoreCase("FullTime")){
                employeeList[Employee.getEmployeeCount()] = this.getFullTimeEmployee();
            } else if (type.equalsIgnoreCase("PartTime")){
                employeeList[Employee.getEmployeeCount()] = this.getPartTimeEmployee();
            } else if (type.equalsIgnoreCase("Contract")){
                employeeList[Employee.getEmployeeCount()] = this.getContractEmployee();
            }
            System.out.print("Do you want to add another Employee (yes/no): ");
            flag = br.readLine();
        } while(flag.equalsIgnoreCase("Yes"));

        return null;
    }

    public void commonEmployeeInfo() throws IOException{
        System.out.print("Enter Employee name: ");
        this.name = br.readLine();
        System.out.print("Employee id: ");
        this.id = Integer.parseInt(br.readLine());
        System.out.print("Employee type(FullTime/PartTime/Contract): ");
        this.type = br.readLine();
        System.out.print("Enter Basic Salary: ");
        this.salary = Double.parseDouble(br.readLine());;
    }
    public Employee getFullTimeEmployee() throws IOException{
        System.out.print("Enter Allowance: ");
        double allowance = Double.parseDouble(br.readLine());
        System.out.print("Enter Bonus: ");
        double bonus = Double.parseDouble(br.readLine());
        Employee fullTimeEmployee = new FullTimeEmployee(this.name,this.id,this.salary,allowance,bonus);
        return fullTimeEmployee;
    }
    public Employee getPartTimeEmployee() throws IOException{
        System.out.print("Enter hoursWorked: ");
        int hoursWorkded = Integer.parseInt(br.readLine());
        System.out.print("Enter hoursRate: ");
        double hoursRate = Double.parseDouble(br.readLine());
        Employee partTimeEmployee = new PartTimeEmployee(this.name,this.id,this.salary,hoursWorkded,hoursRate);
        return partTimeEmployee;
    }
    public Employee getContractEmployee() throws IOException{
        System.out.print("Enter contractDuration: ");
        int contractDuration = Integer.parseInt(br.readLine());
        System.out.print("Enter contractAmount: ");
        double contractAmount = Double.parseDouble(br.readLine());
        Employee contractTimeEmployee = new ContractEmployee(this.name,this.id,this.salary,contractDuration, contractAmount);
        return contractTimeEmployee;
    }
}
