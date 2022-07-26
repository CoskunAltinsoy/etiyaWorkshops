package kodlamaioDbWorkshop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kodlamaioDbWorkshop.entities.Address;
import kodlamaioDbWorkshop.entities.Balance;
import kodlamaioDbWorkshop.entities.Channel;
import kodlamaioDbWorkshop.entities.CorporateCustomer;
import kodlamaioDbWorkshop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		

	Customer customer = new CorporateCustomer(1,"31234",null,null,"Altınsoy","123123",null);

	List<Customer> customers = new ArrayList<Customer>();
	customers.add(customer);
	
	Address address = new Address(1, customer, "ankara/keçiören");
	List<Address> addresses = new ArrayList<Address>();
	addresses.add(address);
	
	Balance balance = new Balance(1, customer,LocalDate.parse("2022-01-01"), 12);
	
	List<Balance> balances = new ArrayList<Balance>();
	balances.add(balance);
	
	Channel channel = new Channel(1, "internet", customers);
	
	customer.setAddresses(addresses);
	customer.setChannel(channel);
	((CorporateCustomer) customer).setBalances(balances);
	
	
	
	System.out.println(customer.getId()+" "+((CorporateCustomer) customer).getBalances().get(0).getPrice());

	}

}
