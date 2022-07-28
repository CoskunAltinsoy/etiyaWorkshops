package kosgebWorkshop.entities;

import java.time.LocalDate;

public class Credit {

	private int id;
	private String creditName;
	private LocalDate crediStartedDate;
	private LocalDate crediDueDate;
	private  CreditType creditType;
	public Credit() {
		super();
	}
	public Credit(int id, String creditName, LocalDate crediStartedDate, LocalDate crediDueDate,
			CreditType creditType) {
		super();
		this.id = id;
		this.creditName = creditName;
		this.crediStartedDate = crediStartedDate;
		this.crediDueDate = crediDueDate;
		this.creditType = creditType;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreditName() {
		return creditName;
	}
	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}
	public LocalDate getCrediStartedDate() {
		return crediStartedDate;
	}
	public void setCrediStartedDate(LocalDate crediStartedDate) {
		this.crediStartedDate = crediStartedDate;
	}
	public LocalDate getCrediDueDate() {
		return crediDueDate;
	}
	public void setCrediDueDate(LocalDate crediDueDate) {
		this.crediDueDate = crediDueDate;
	}
	public CreditType getCreditType() {
		return creditType;
	}
	public void setCreditType(CreditType creditType) {
		this.creditType = creditType;
	}
	
}
