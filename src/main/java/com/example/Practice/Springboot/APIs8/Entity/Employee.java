package com.example.Practice.Springboot.APIs8.Entity;

public class Employee {

    private String employeeId;
    private String employeeName;
    private String department;

    // Constructor

    public Employee(String employeeId, String employeeName, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }
    // Getter

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return employeeId + " -> " + employeeName + " -> " + department;
    }

}
