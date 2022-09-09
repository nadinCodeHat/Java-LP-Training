package com.nadin.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadin.training.salesmanager.model.Employee;
import com.nadin.training.salesmanager.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
	}
	
	//@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("Overload constructor executed");
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter injection fired");
		this.employeeRepository = employeeRepository;
	}
}
