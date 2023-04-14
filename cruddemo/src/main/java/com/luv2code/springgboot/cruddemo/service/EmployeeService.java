package com.luv2code.springgboot.cruddemo.service;

import com.luv2code.springgboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);

    Employee save(Employee employee);

    void deleteById(int theId);
}
