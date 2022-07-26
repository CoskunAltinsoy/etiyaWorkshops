package kodlamaioDbWorkshop.entities;

import java.util.List;

public class Channel {
	private int id;
	private String channelName;
	private List<Customer> customers;
	
	
	public Channel(int id, String channelName, List<Customer> customers) {
		super();
		this.id = id;
		this.channelName = channelName;
		this.customers = customers;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
