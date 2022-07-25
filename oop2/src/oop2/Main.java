package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add(new Customer());
		
		Employee employee = new Employee();

		
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new CloudLogger());
		loggers.add(new DatabaseLogger());
		
		EmployeeManager employeeManager = new EmployeeManager(loggers);
		employeeManager.add(employee);
	

	

	}

}
