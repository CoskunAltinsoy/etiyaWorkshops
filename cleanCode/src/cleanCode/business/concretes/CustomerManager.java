package cleanCode.business.concretes;

import cleanCode.business.abstracts.CustomerService;
import cleanCode.core.adapters.abstracts.MernisService;
import cleanCode.dataAccess.abstracts.CustomerRepository;
import cleanCode.dataAccess.concretes.hibernateImpls.HibernateCustomerRepository;
import cleanCode.entities.concretes.Customer;
import cleanCode.entities.concretes.Person;

public class CustomerManager implements CustomerService{
	
	CustomerRepository customerRepository;
	MernisService mernisService;
	public CustomerManager(CustomerRepository customerRepository,MernisService mernisService) {
		super();
		this.customerRepository = customerRepository;
		this.mernisService = mernisService;
	}

	public void add(Customer customer) throws Exception {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);
		validateNationalIdIfEmpty(customer);
		validatenFirstNameLength(customer);
		HibernateCustomerRepository customerRepository = new HibernateCustomerRepository();
		checkCustomerExist(customer);
		checkPersonExist(customer);
		customerRepository.add(customer);
	}
	
	public void addByOtherBusiness(Customer customer) throws Exception {
		validateFirstNameIfEmpty(customer);
		validateLastNameIfEmpty(customer);

		validatenFirstNameLength(customer);
		HibernateCustomerRepository customerRepository = new HibernateCustomerRepository();
		checkCustomerExist(customer);
		customerRepository.add(customer);
		
	}
	
	private void validateFirstNameIfEmpty(Customer customer) throws Exception  {
		if (customer.getFirstName().isEmpty() || customer.getFirstName() == null) {
			throw new Exception("validation error");
			}
		}
	
		
	private void validateLastNameIfEmpty(Customer customer) throws Exception  {
		if (customer.getLastName().isEmpty() || customer.getFirstName() == null) {
			throw new Exception("validation error");	
			}
		}


	private void validateNationalIdIfEmpty(Customer customer) throws Exception  {
		if (customer.getNationalId().isEmpty() || customer.getNationalId() == null) {
			throw new Exception("validation error");
			}
		}	
	
	private void validatenFirstNameLength(Customer customer) throws Exception  {
		if (customer.getFirstName().length() < 2) {
			throw new Exception("validation error");
			}
		}	
	
	private void checkCustomerExist(Customer customer) throws Exception {
		HibernateCustomerRepository customerRepository = new HibernateCustomerRepository();
		if (customerRepository.customerExist(customer)) {
			throw new Exception("customer already exist");
		}
		
	}
	
	private void checkPersonExist(Person person) throws Exception {
		if (!mernisService.checkPerson(person)) {
			throw new Exception();
		}
	}

}
