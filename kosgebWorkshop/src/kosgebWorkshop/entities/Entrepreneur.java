package kosgebWorkshop.entities;



public class Entrepreneur extends User{

	private String entrepreneurNumber;
	private int crediScore;
	private boolean applicable;
	private BannedList bannedList;
	
	public Entrepreneur() {
		super();
	}
	public Entrepreneur(int id, String phoneNumber, String email, String password,
			String entrepreneurNumber, int crediScore, boolean applicable,BannedList bannedList) {
		super(id,phoneNumber,email,password);
		this.entrepreneurNumber = entrepreneurNumber;
		this.crediScore = crediScore;
		this.applicable = applicable;
		this.bannedList = bannedList;
	
	}
	public String getEntrepreneurNumber() {
		return entrepreneurNumber;
	}
	public void setEntrepreneurNumber(String entrepreneurNumber) {
		this.entrepreneurNumber = entrepreneurNumber;
	}
	public int getCrediScore() {
		return crediScore;
	}
	public void setCrediScore(int crediScore) {
		this.crediScore = crediScore;
	}
	public boolean isApplicable() {
		return applicable;
	}
	public void setApplicable(boolean applicable) {
		this.applicable = applicable;
	}
	public BannedList getBannedList() {
		return bannedList;
	}
	public void setBannedList(BannedList bannedList) {
		this.bannedList = bannedList;
	}
	
	
}
