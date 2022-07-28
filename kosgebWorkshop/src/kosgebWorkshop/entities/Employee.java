package kosgebWorkshop.entities;

public class Employee {

	private String firstName;
	private String lastName;
	private String branch;
	private Type type;
	
	public Employee() {
		super();
	}
	
	public Employee(String firstName, String lastName, String branch, Type type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;	
		this.type =  type;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}
