package com.example.Employee.Application.controller;

import com.example.Employee.Application.entity.Employee;
import com.example.Employee.Application.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @RequestMapping("/employees/{id}")
    public Employee findAnEmployee(@PathVariable int id){
        return employeeService.getAnEmployee(id);

    }
}