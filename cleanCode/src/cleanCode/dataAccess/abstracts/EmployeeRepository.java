package cleanCode.dataAccess.abstracts;

import java.util.List;

import cleanCode.entities.concretes.Employee;

public interface EmployeeRepository {

	public List<Employee> getAll();
}
