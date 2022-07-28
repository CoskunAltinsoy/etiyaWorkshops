package kosgebWorkshop.entities;

import java.util.ArrayList;
import java.util.List;

public class CreditType {

	private int id;
	private String creditTypeName;
	private final List<Credit> credits = new ArrayList<>();
	
	
	public CreditType() {
		super();
	}
	
	
	public CreditType(int id, String creditTypeName) {
		super();
		this.id = id;
		this.creditTypeName = creditTypeName;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreditTypeName() {
		return creditTypeName;
	}
	public void setCreditTypeName(String creditTypeName) {
		this.creditTypeName = creditTypeName;
	}
	
}
