package cleanCode.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import cleanCode.dataAccess.abstracts.EmployeeRepository;
import cleanCode.entities.concretes.Employee;

public class HibernateEmployeeRepository implements EmployeeRepository{

	@Override
	public List<Employee> getAll() {
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setFirstName("Mücahit");
		employee1.setLastName("Altınsoy");
		employee1.setNationalId("23243423");
		employee1.setYearOfBirth(1996);
		employee1.setSalary(12123);
		
		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setFirstName("Kadir");
		employee2.setLastName("Altınsoy");
		employee2.setNationalId("433434");
		employee2.setYearOfBirth(1963);
		employee2.setSalary(15000);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		return employees;
	}

}
