package com.luv2code.springgboot.cruddemo.rest;

import com.luv2code.springgboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springgboot.cruddemo.entity.Employee;
import com.luv2code.springgboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> finAll(){
         return employeeService.findAll();
    }
}
