package kosgebWorkshop.entities;

public class BankUser {

	private int id;
	private  Bank bank;
	private  User user;
	public BankUser() {
		super();
	}
	public BankUser(int id, Bank bank, User user) {
		super();
		this.id = id;
		this.bank = bank;
		this.user = user;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
		
}
