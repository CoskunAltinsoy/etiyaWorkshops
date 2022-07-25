package kodlamaioDbWorkshop.entities;

public class CommercialActivity {
	private int id;
	private IndividualCustomer individualCustomer;
	
	public CommercialActivity() {
		super();
	}

	public CommercialActivity(int id, IndividualCustomer individualCustomer) {
		super();
		this.id = id;
		this.individualCustomer = individualCustomer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IndividualCustomer getIndividualCustomer() {
		return individualCustomer;
	}

	public void setIndividualCustomer(IndividualCustomer individualCustomer) {
		this.individualCustomer = individualCustomer;
	}
	

}
