package com.nadin.training.salesmanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.nadin.training.salesmanager.service.EmployeeService;
import com.nadin.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.nadin")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	@Bean(name = "employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySorucesPlacerHolderConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean(name = "employeeRepository")
//	public EmployeeRepository getEmployeeRepository() {
//		return new HibernateEmployeeRepositoryImpl();
//	}
}
