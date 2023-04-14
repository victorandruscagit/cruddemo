package com.luv2code.springgboot.cruddemo.service;

import com.luv2code.springgboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
