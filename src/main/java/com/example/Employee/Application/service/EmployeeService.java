package com.example.Employee.Application.service;

import org.springframework.stereotype.Service;
import com.example.Employee.Application.entity.Employee;

import java.util.Arrays;
import java.util.List;
@Service
public class EmployeeService {
    List<Employee> employeeList = Arrays.asList(
            new Employee(1, "Kumkum", "Dhaka"),
            new Employee(2, "Soumi", "Kolkata"),
            new Employee(3, "Akila", "Tamil")
    );
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public Employee getAnEmployee(int id) {
        return employeeList.stream().filter(e -> (
                e.getEmployeeId() == id)).findFirst().get();

    }

}
