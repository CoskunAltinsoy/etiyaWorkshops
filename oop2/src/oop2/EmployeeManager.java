package oop2;

import java.util.List;

public class EmployeeManager {

	private List<Logger> loggers;

	public EmployeeManager(List<Logger> loggers) {
		this.loggers = loggers;
	}
	
	public void add(Employee employee) {
		System.out.println("employee added");
		runLoggers(employee);
		
	}
	
	public void delete(Employee employee) {
		System.out.println("employee deleted");
		runLoggers(employee);
	}
	
	public List<Logger> getAll(){
		return loggers;
	}
	
	private void runLoggers(Employee employee) {
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName());
		}
	}
}
