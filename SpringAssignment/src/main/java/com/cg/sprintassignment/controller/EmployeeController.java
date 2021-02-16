package com.cg.sprintassignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sprintassignment.domain.Employee;
import com.cg.sprintassignment.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
	}

	@GetMapping("/employee/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable int empId) {
		return employeeService.getEmployeeById(empId);
	}

	@GetMapping("/employeebysalrange/{lower}/{higher}")
	public List<Employee> getEmployeeBySalaryRange(@PathVariable double lower, @PathVariable double higher) {
		return employeeService.getEmployeesBySalRange(lower, higher);
	}
}
