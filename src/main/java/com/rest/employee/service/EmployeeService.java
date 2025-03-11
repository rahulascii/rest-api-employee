package com.rest.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.employee.model.EmployeeDetails;
import com.rest.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDetails setEmployeeDetails(EmployeeDetails employeeDetails) {

        return employeeRepository.save(employeeDetails);
    }


    
}
