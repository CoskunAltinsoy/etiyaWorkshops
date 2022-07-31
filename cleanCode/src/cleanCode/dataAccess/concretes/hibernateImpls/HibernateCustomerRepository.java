package cleanCode.dataAccess.concretes.hibernateImpls;

import cleanCode.dataAccess.abstracts.CustomerRepository;
import cleanCode.entities.concretes.Customer;

public class HibernateCustomerRepository implements CustomerRepository{

	public void add(Customer customer) {
		System.out.println("added");
	}
	
	public boolean customerExist(Customer customer) {
		return false;
	}
}
