package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;

@RestController
@RequestMapping("/rest/emp")
public class EmployeeController {

	private List<Employee> employees = new ArrayList<>();

	public EmployeeController() {
		employees.add(new Employee("Rahul", "1", "Soft Eng"));
		employees.add(new Employee("Sandeep", "2", "Eng Manager"));
		employees.add(new Employee("Ranveer", "3", "Head Eng"));
	}

	@GetMapping("/")
	public List<Employee> getAllEmployee() {
		return employees;
	}

}
