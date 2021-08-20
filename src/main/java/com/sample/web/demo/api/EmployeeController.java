package com.sample.web.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.web.demo.model.Employee;

@RestController
@RequestMapping(path = "/employees/v1")
public class EmployeeController {

	@GetMapping
	public Employee sayHello() {
		return _employeeService.getEmployee();
	}
	
	@Autowired
	private EmployeeService _employeeService; 
	
}
