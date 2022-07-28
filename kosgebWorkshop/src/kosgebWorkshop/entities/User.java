package kosgebWorkshop.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int id;
	private String phoneNumber;
	private String email;
	private String password;
	private final List<Role> roles = new ArrayList<>();
	
	public User() {
		super();
	}
	public User(int id, String phoneNumber, String email, String password) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
