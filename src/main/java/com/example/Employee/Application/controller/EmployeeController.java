package com.example.Employee.Application.controller;

import com.example.Employee.Application.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
public class EmployeeController {

    @RequestMapping("/employees")
    public List<Employee> findAllEmployees(){
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Kumkum", "Dhaka"),
                new Employee(2, "Soumi", "Kolkata"),
                new Employee(3, "Akila", "Tamil")
        );
        return employeeList;
    }
}
