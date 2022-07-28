package kosgebWorkshop.entities;

import java.util.ArrayList;
import java.util.List;

public class Type {

	private int id;
	private String typeName;
	private int typeParentId;
	private final List<Employee> employees = new ArrayList<>();
	
	public Type() {
		super();
	}
	public Type(int id, String typeName, int typeParentId) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.typeParentId = typeParentId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getTypeParentId() {
		return typeParentId;
	}
	public void setTypeParentId(int typeParentId) {
		this.typeParentId = typeParentId;
	}
		
}
