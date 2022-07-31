package cleanCode.dataAccess.abstracts;

import cleanCode.entities.concretes.Customer;

public interface CustomerRepository {
	
	public void add(Customer customer);
	public boolean customerExist(Customer customer);
}
