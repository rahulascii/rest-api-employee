package com.rest.employee.service;

import java.util.List;
import java.util.Optional;

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

    public List<EmployeeDetails> getAllEmployeeDetails() {

        return employeeRepository.findAll();
    }

    public EmployeeDetails getEmployeeDetailsById(Long id) {

        return employeeRepository.findById(id).orElse(null);

    }

    public EmployeeDetails deleteEmployeeDetails(Long id) {

        EmployeeDetails emp = employeeRepository.findById(id).orElse(null);
        if (emp != null) {
            employeeRepository.deleteById(id);
        }
        return emp;

    }

    public EmployeeDetails updateEmployeeDetails(Long id, EmployeeDetails updatedEmployee) {
        Optional<EmployeeDetails> optionalEmployee = employeeRepository.findById(id);

        if (optionalEmployee.isPresent()) {
            EmployeeDetails existingEmployee = optionalEmployee.get();
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setAddress(updatedEmployee.getAddress());
            existingEmployee.setIsActive(updatedEmployee.getIsActive());

            return employeeRepository.save(existingEmployee);
        }
        return null;
    }

}
