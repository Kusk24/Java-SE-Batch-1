package com.example.model;

public class ContractEmployee extends Employee{
    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int id, double salary, int contractDuration, double contractAmount){
        super(name, id, salary);
        this.contractDuration = contractDuration;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return this.contractAmount /this.contractDuration;
    }

    @Override
    public void displayDetails() {
        System.out.println("******ContractEmployee******");
        super.displayDetails();
    }
}
