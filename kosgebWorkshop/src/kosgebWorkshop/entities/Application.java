package kosgebWorkshop.entities;

import java.time.LocalDate;

public class Application {

	private int id;
	private boolean applicationState;
	private LocalDate applicationDate;
	private  Entrepreneur entrepreneur;
	private  Credit credit;
	private  ApplicationPriority applicationPriority;
	
	
	public Application() {
		super();
	}
	public Application(int id, boolean applicationState, LocalDate applicationDate,
			Entrepreneur entrepreneur, Credit credit, ApplicationPriority applicationPriority) {
		super();
		this.id = id;
		this.applicationState = applicationState;
		this.applicationDate = applicationDate;
		this.entrepreneur =  entrepreneur;
		this.credit = credit;
		this.applicationPriority = applicationPriority;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isApplicationState() {
		return applicationState;
	}
	public void setApplicationState(boolean applicationState) {
		this.applicationState = applicationState;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Entrepreneur getEntrepreneur() {
		return entrepreneur;
	}
	public void setEntrepreneur(Entrepreneur entrepreneur) {
		this.entrepreneur = entrepreneur;
	}
	public Credit getCredit() {
		return credit;
	}
	public void setCredit(Credit credit) {
		this.credit = credit;
	}
	public ApplicationPriority getApplicationPriority() {
		return applicationPriority;
	}
	public void setApplicationPriority(ApplicationPriority applicationPriority) {
		this.applicationPriority = applicationPriority;
	}
	
	
}
