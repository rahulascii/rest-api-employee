package com.rest.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.employee.model.EmployeeDetails;

public interface EmployeeRepository extends JpaRepository<EmployeeDetails,Long>{
    
}
