package com.nadin.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.nadin.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Nadin");
		employee.setEmployeeLocation("Dematagoda");
		employees.add(employee);
		return employees;
	}
}
