package com.sample.web.demo.api;

import org.springframework.stereotype.Service;

import com.sample.web.demo.model.Employee;

@Service
public class EmployeeService {

	
	public Employee getEmployee() {
		
		Employee employee = new Employee("Deeher", "Das", 3L, "Daycare"); 
		return employee;
	}
	
}
