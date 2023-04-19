package com.luv2code.springgboot.cruddemo.rest;

import com.luv2code.springgboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springgboot.cruddemo.entity.Employee;
import com.luv2code.springgboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId ){
        Employee theEmployee = employeeService.findById(employeeId);
        if (theEmployee == null) {
            throw new RuntimeException("Employee  id ot found " + employeeId);
        }
        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmpployee){
        Employee dbEmployee = employeeService.save(theEmpployee);
        return  dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId) {
        Employee tempEmployee = employeeService.findById(employeeId);
        if (tempEmployee == null) {
            throw  new RuntimeException("Employee id not found " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return  String.format("Deleted employee  with id  %x - ", employeeId);

    }



}
