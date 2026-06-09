package com.example.Practice.Springboot.APIs8.Controller;

import com.example.Practice.Springboot.APIs8.Entity.Employee;
import com.example.Practice.Springboot.APIs8.Service.EmployeeManager;

import java.util.ArrayList;
import java.util.List;

public class EmployeePostDemo {
    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        // Display Existing Employees
        System.out.println("=== Existing Employees ===");
        manager.displayEmployees();

        // New Employee (POST Request Simulation)
        Employee newEmployee = new Employee("E104", "Ali", "IT");

        System.out.println("\n=== Processing POST Request ===");
        System.out.println(manager.addEmployee(newEmployee));

        // Display Updated Employee List
        System.out.println("\n=== Final Employee List ===");
        manager.displayEmployees();

    }


}
