package kosgebWorkshop.entities;

import java.util.ArrayList;
import java.util.List;

public class Role {
	
	private int id;
	private String name;
	private final List<User> users = new ArrayList<>();
	
	public Role() {
		super();
	}
	
	public Role(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

}
