package oop1;

public class Product {	

	private int id;	
	private String name;
	private double unitPrice;
	private double discountedPrice;
	private Category category;
	
	
	public Product() {
		System.out.println("syapıcı blok çalıştı");
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getDiscountedPrice() {
		return this.unitPrice * 0.90;
	}
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	
}
