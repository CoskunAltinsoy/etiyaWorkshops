package oop2;

public class CustomerManager {
	
	private Logger logger;
	
	public CustomerManager(Logger logger) {
		this.logger = logger;
	}
	
	public void add(Customer customer) {
		System.out.println("customer added");
		this.logger.log(customer.getFirstName());
		
	}
	
	public void update(Customer customer) {
		System.out.println("customer updated");		
		this.logger.log(customer.getFirstName());
	}
}
