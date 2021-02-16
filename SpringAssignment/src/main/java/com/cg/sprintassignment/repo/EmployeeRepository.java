package com.cg.sprintassignment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.sprintassignment.domain.Employee;

public interface EmployeeRepository extends JpaRepository< Employee,Integer>{

	@Query("from Employee where salary>=:lower and salary<=:higher")
	 List<Employee> getEmployeeDetailsBySalRange(@Param("lower") double lowsal,@Param("higher") double highsal );

}
