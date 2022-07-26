package entities;

import java.time.LocalDate;

public class Invoice {

	private int id;
	private Subscription subscriptionId;
	private LocalDate dateCreated;
	private LocalDate dueDate;
	public Invoice() {
		super();
	}
	public Invoice(int id, Subscription subscriptionId, LocalDate dateCreated, LocalDate dueDate) {
		super();
		this.id = id;
		this.subscriptionId = subscriptionId;
		this.dateCreated = dateCreated;
		this.dueDate = dueDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Subscription getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Subscription subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	
}
