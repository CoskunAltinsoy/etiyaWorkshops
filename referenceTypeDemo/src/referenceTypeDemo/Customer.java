package referenceTypeDemo;

public class Customer extends Person{

	private String creditCardNo;

	public Customer() {
		super();
	}
	
	public Customer(int id, int firstName,String creditCardNo) {
		super(id,firstName);
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	
}
