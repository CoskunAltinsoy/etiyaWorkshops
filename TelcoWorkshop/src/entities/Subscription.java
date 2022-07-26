package entities;

import java.time.LocalDate;

public class Subscription {

	private int id;	
	private LocalDate dateStarted;
	private Customer customerId;
	private Service serviceId;
	public Subscription() {
		super();
	}
	public Subscription(int id, LocalDate dateStarted, Customer customerId, Service serviceId) {
		super();
		this.id = id;
		this.dateStarted = dateStarted;
		this.customerId = customerId;
		this.serviceId = serviceId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public Service getServiceId() {
		return serviceId;
	}
	public void setServiceId(Service serviceId) {
		this.serviceId = serviceId;
	}
	
	
}
