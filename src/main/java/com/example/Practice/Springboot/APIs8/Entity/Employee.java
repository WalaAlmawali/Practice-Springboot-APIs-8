package com.example.Practice.Springboot.APIs8.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @NotBlank
    private String employeeName;
    @NotBlank
    private String department;

    // Constructor

    public Employee( String employeeName, String department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    public Employee() {
    }
    // Getter

    public Long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    //Setter

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return employeeId + " -> " + employeeName + " -> " + department;
    }

}
