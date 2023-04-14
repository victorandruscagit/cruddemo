package com.luv2code.springgboot.cruddemo.dao;

import com.luv2code.springgboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
