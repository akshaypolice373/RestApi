package com.akshay.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshay.spring.dao.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
