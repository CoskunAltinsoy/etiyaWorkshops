package kodlamaioDbWorkshop.entities;

import java.util.List;

public class IndividualCustomer extends Customer{

	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private CommercialActivity commercialActivity;	
		
	public IndividualCustomer() {
		super();
	}
	public IndividualCustomer(int id, String customerNo, Channel channel, List<Address> addresses, String firstName,
			String lastName, String nationalIdentity, CommercialActivity commercialActivity) {
		super(id, customerNo, channel, addresses);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.commercialActivity = commercialActivity;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	public CommercialActivity getCommercialActivity() {
		return commercialActivity;
	}
	public void setCommercialActivity(CommercialActivity commercialActivity) {
		this.commercialActivity = commercialActivity;
	}
	
	
}
