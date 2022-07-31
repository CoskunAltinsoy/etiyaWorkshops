package cleanCode.entities.concretes;

import cleanCode.entities.abstracts.Entitiy;

public class Person implements Entitiy{

	private int id;
	private String firstName;
	private String lastName;
	private String nationalId;
	private int yearOfBirth;
	
	
	public Person() {
		super();
	}


	public Person(int id, String firstName, String lastName, String nationalId, int yearOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.yearOfBirth = yearOfBirth;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
}
