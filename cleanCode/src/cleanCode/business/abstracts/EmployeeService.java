package cleanCode.business.abstracts;

import java.util.List;

import cleanCode.entities.concretes.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
}
