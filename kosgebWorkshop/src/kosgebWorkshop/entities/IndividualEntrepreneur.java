package kosgebWorkshop.entities;


public class IndividualEntrepreneur extends Entrepreneur {

	private String firstName;
	private String lastName;
	private String natId;
	
	public IndividualEntrepreneur() {
		super();
	}
	public IndividualEntrepreneur(int id, String phoneNumber, String email, String password,
			String entrepreneurNumber, int crediScore, boolean applicable, BannedList bannedList,
			String firstName, String lastName, String natId) {
		
		super(id,phoneNumber,email,password,entrepreneurNumber, crediScore, applicable, bannedList);
		this.firstName = firstName;
		this.lastName = lastName;
		this.natId = natId;
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
	public String getNatId() {
		return natId;
	}
	public void setNatId(String natId) {
		this.natId = natId;
	}
	
	
}
