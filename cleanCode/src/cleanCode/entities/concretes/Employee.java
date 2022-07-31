package cleanCode.entities.concretes;

public class Employee extends Person {

	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String nationalId, int yearOfBirth,double salary) {
		super(id,firstName,lastName,nationalId,yearOfBirth);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
