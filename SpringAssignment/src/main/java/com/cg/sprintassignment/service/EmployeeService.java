package com.cg.sprintassignment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprintassignment.domain.Employee;
import com.cg.sprintassignment.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Optional<Employee> getEmployeeById(int empId) {
		return employeeRepo.findById(empId);
	}

	public List<Employee> getEmployeesBySalRange(double lower, double higher) {
		// return employeeDao.findBySalaryBetween(lower, higher);
		return employeeRepo.getEmployeeDetailsBySalRange(lower, higher);
	}

}
