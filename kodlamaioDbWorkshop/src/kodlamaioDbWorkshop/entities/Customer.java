package kodlamaioDbWorkshop.entities;

import java.util.List;

public  class Customer {
	
	private int id;
	private String customerNo;
	private Channel channel;
	private List<Address> addresses;
	
	
	
	public Customer() {
		super();
	}
	public Customer(int id, String customerNo, Channel channel, List<Address> addresses) {
		super();
		this.id = id;
		this.customerNo = customerNo;
		this.channel = channel;
		this.addresses = addresses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	

}
