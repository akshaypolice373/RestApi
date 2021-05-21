package com.akshay.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akshay.spring.dao.Employee;
import com.akshay.spring.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins="Http://localhost:3000")
@RequestMapping("/api/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("employee")
	public List<Employee> getEmployeeData() {
		return employeeRepository.findAll();
	}
}
