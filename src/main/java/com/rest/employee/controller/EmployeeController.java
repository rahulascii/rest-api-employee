package com.rest.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.model.EmployeeDetails;
import com.rest.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/")
    public EmployeeDetails setEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        //TODO: process POST request
        
        return employeeService.setEmployeeDetails(employeeDetails);
    }
    
   
    
}
