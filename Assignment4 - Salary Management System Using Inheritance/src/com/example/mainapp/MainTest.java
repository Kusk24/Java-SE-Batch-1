package com.example.mainapp;
import com.example.model.Employee;
import com.example.service.ExampleRegistrationService;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {
        ExampleRegistrationService service = new ExampleRegistrationService();
        service.getEmployeesInfo();


        for (int i = 0; i<Employee.getEmployeeCount(); i++){
            service.employeeList[i].displayDetails();
        }
    }
}
