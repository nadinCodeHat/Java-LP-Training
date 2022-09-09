package com.nadin.training.salesmanager.repository;

import java.util.List;

import com.nadin.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}