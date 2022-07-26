package kodlamaioDbWorkshop.entities;

import java.util.List;

public class CorporateCustomer extends Customer {
	
	private String corporateName;
	private String taxNo;
	private List<Balance> balances;
	
	
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id, String customerNo, Channel channel, List<Address> addresses, String corporateName,
			String taxNo, List<Balance> balances) {
		super(id, customerNo, channel, addresses);
		this.corporateName = corporateName;
		this.taxNo = taxNo;
		this.balances = balances;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getTaxNo() {
		return taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}
	public List<Balance> getBalances() {
		return balances;
	}
	public void setBalances(List<Balance> balances) {
		this.balances = balances;
	}
	

}
