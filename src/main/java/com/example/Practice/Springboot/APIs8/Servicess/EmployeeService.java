package com.example.Practice.Springboot.APIs8.Servicess;

import com.example.Practice.Springboot.APIs8.Entity.Employee;
import com.example.Practice.Springboot.APIs8.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    //Add employee
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    //Get all employee
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }


    // Get employee by ID
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee Not Found"));
    }

    // Update employee
    public Employee updateEmployee(Long id, Employee employee) {

        Employee existing = getEmployeeById(id);

        existing.setEmployeeName(
                employee.getEmployeeName());

        existing.setDepartment(
                employee.getDepartment());

        return repository.save(existing);
    }

    // Delete employee
    public void deleteEmployee(Long id) {

        repository.deleteById(id);
    }

}
