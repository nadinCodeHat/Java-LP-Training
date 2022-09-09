package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nadin.training.salesmanager.config.ApplicationConfiguration;
import com.nadin.training.salesmanager.model.Employee;
import com.nadin.training.salesmanager.service.EmployeeService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		EmployeeService employeeService = applicationContext.getBean(
				"employeeService", EmployeeService.class);
				
		System.out.println(employeeService.toString());
		
		
		EmployeeService employeeService2 = applicationContext.getBean(
				"employeeService", EmployeeService.class);
		
		System.out.println(employeeService2.toString());
		
		List<Employee> employees = employeeService.getAllEmployees();
		
		
		for (Employee employee: employees) {
			System.out.println(employee.getEmployeeName() + " at "
					+ employee.getEmployeeLocation());
		}
			
	}

}
