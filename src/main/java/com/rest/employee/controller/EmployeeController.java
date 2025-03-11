package com.rest.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.rest.employee.model.EmployeeDetails;
import com.rest.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDetails setEmployeeDetails(@RequestBody EmployeeDetails employeeDetails) {
        // TODO: process POST request

        return employeeService.setEmployeeDetails(employeeDetails);
    }

    @GetMapping
    public List<EmployeeDetails> getAllEmployeeDetails() {
        return employeeService.getAllEmployeeDetails();
    }

    @GetMapping("/{id}")
    public EmployeeDetails getEmployeeDetailsById(@PathVariable Long id) {
        return employeeService.getEmployeeDetailsById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEmployeeDetailsById(@PathVariable Long id) {
        EmployeeDetails deleteEmployeeDetails = employeeService.deleteEmployeeDetails(id);
        if (deleteEmployeeDetails == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found!");
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT)
                    .body("Employee deleted successfully" + deleteEmployeeDetails);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateEmployeeDetails(@PathVariable Long id,
            @RequestBody EmployeeDetails updatedEmployeedetails) {
        // TODO: process PUT request

        EmployeeDetails updated = employeeService.updateEmployeeDetails(id, updatedEmployeedetails);
        if (updated != null) {
            return ResponseEntity.ok(updated); // ✅ Return updated employee
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found with ID: " + id);
        }

    }

}
