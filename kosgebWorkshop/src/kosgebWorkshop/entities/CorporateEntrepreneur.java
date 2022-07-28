package kosgebWorkshop.entities;

public class CorporateEntrepreneur extends Entrepreneur {

	private String companyName;
	private String textNo;
	
	public CorporateEntrepreneur() {
		super();
	}
	public CorporateEntrepreneur(int id, String phoneNumber, String email, String password,
			String entrepreneurNumber, int crediScore, boolean applicable, BannedList bannedList,String companyName, String textNo) {
		super(id, phoneNumber, email, password ,entrepreneurNumber,crediScore,applicable,bannedList);
		this.companyName = companyName;
		this.textNo = textNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTextNo() {
		return textNo;
	}
	public void setTextNo(String textNo) {
		this.textNo = textNo;
	}
	
	
	
}
