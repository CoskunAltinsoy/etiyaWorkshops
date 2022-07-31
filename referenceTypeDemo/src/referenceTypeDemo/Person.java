package referenceTypeDemo;

public class Person {

	private int id;
	private int firstName;
	
	public Person() {
		super();
	}

	public Person(int id, int firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFirstName() {
		return firstName;
	}

	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	
	
}
