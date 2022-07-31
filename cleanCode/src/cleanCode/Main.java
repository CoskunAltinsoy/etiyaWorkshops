package cleanCode;

import cleanCode.business.abstracts.CustomerService;
import cleanCode.business.concretes.CustomerManager;
import cleanCode.business.concretes.EmployeeManager;
import cleanCode.core.adapters.concretes.MernisServiceAdapter;
import cleanCode.dataAccess.concretes.hibernateImpls.HibernateCustomerRepository;
import cleanCode.dataAccess.concretes.hibernateImpls.HibernateEmployeeRepository;
import cleanCode.entities.concretes.Customer;
import cleanCode.entities.concretes.Employee;

public class Main {

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(1, "Mücahit Coşkun", "Altınsoy","232323323", 1996, 1);
		CustomerService customerManager =  new CustomerManager(new HibernateCustomerRepository(), new MernisServiceAdapter());
		customerManager.add(customer);
		
		EmployeeManager employeeManager = new EmployeeManager(new HibernateEmployeeRepository());
		
		for (Employee employee : employeeManager.getAll()) {
			System.out.println(employee.getFirstName()+" "+employee.getLastName()+" "+employee.getSalary());
		}

	}

}
