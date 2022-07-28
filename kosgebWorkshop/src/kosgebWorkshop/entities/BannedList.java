package kosgebWorkshop.entities;

public class BannedList {

	private int id;
	private Entrepreneur entrepreneur;
	
	public BannedList() {
		super();
	}
	
	public BannedList(int id, Entrepreneur entrepreneur) {
		super();
		this.id = id;
		this.entrepreneur = entrepreneur;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Entrepreneur getEntrepreneur() {
		return entrepreneur;
	}

	public void setEntrepreneur(Entrepreneur entrepreneur) {
		this.entrepreneur = entrepreneur;
	}
		
}
