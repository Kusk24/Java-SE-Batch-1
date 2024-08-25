package com.example.Main;
import com.example.service.ExampleRegistrationService;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ExampleRegistrationService service = new ExampleRegistrationService();
        service.getEmployeesInfo();

    }
}
