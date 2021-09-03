package com.byndr.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byndr.project.model.Employee;

@Repository
//repository that extends JpaRepository 
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
