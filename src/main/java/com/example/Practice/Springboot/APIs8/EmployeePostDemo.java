package com.example.Practice.Springboot.APIs8;

import java.util.ArrayList;
import java.util.List;

public class EmployeePostDemo {
    public static void main(String[] args) {

        // Employees list
        List<Employee> employees = new ArrayList<>();

        //add employee to the list
        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Marketing"));


        // Display Existing Employees
        System.out.println("=== Existing Employees ===");
        displayEmployees(employees);

        // New Employee (POST Request Simulation)
        Employee newEmployee = new Employee("E104", "Ali", "IT");

        System.out.println("\n=== Processing POST Request ===");

        // Validation: Check Duplicate ID
        boolean exists = false;

        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(newEmployee.getEmployeeId())) {
                exists = true;
                break;
            }
        }

        // Perform POST Operation
        if (exists) {
            System.out.println("Employee ID already exists");
            System.out.println("No employee was created");
        } else {
            employees.add(newEmployee);

            System.out.println("Employee Added Successfully");
            System.out.println("Employee ID: " + newEmployee.getEmployeeId());
            System.out.println("Employee Name: " + newEmployee.getEmployeeName());
            System.out.println("Department: " + newEmployee.getDepartment());
            System.out.println("Status: Created");
        }

        // Display Updated Employee List
        System.out.println("\n=== Final Employee List ===");
        displayEmployees(employees);
    }

    //Display function
    public static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
