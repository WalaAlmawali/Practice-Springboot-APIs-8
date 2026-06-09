package com.example.Practice.Springboot.APIs8.Service;

import com.example.Practice.Springboot.APIs8.Entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    // Employees list
    List<Employee> employees = new ArrayList<>();

    public EmployeeManager(){

        //add employee to the list
        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "John", "Marketing"));

    }

    public String addEmployee(Employee employee){

        for (Employee e : employees) {
            if (e.getEmployeeId().equals(employee.getEmployeeId())) {
                return "Employee ID already exists\n"
                        + "No employee was created";
            }
        }
        employees.add(employee);
        return "Employee Added Successfully\n"
                + "Employee ID: " + employee.getEmployeeId() + "\n"
                +"Employee Name: " + employee.getEmployeeName()+ "\n"
                +"Department: " + employee.getDepartment()+"\n"
                +"Status: Created";

    }


    //Display function
    public  void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
