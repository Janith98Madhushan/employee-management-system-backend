package com.janith.EmployeeRepoBackEnd.repository;

import com.janith.EmployeeRepoBackEnd.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}


