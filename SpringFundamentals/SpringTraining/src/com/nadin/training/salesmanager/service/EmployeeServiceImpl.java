package com.nadin.training.salesmanager.service;

import java.util.List;

import com.nadin.training.salesmanager.model.Employee;
import com.nadin.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.getAllEmployees();
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
