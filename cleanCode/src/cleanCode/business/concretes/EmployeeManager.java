package cleanCode.business.concretes;

import java.util.List;

import cleanCode.business.abstracts.EmployeeService;
import cleanCode.dataAccess.abstracts.EmployeeRepository;
import cleanCode.entities.concretes.Employee;

public class EmployeeManager implements EmployeeService{

	EmployeeRepository employeeRepository;
	
	public EmployeeManager(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.getAll();
	}

	
}
