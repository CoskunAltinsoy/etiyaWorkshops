package oop1;

public class Main {

	public static void main(String[] args) {
	
		Category category1 =  new Category();
		category1.setId(1);
		category1.setName("Meyve");
		
		Category category2 =  new Category();
		category2.setId(2);
		category2.setName("Yemek");
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Elma");
		product1.setUnitPrice(50);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Kuru Fasülye");
		product2.setUnitPrice(60);
		product2.setCategory(category2);
		
		ProductService productService = new ProductService();
		productService.add(product2);
		
		System.out.println(product2.getName());
		System.out.println(product2.getUnitPrice());
		System.out.println(product2.getDiscountedPrice());
		System.out.println(product2.getCategory().getName());
		
//		Product product1 = new Product();
//		product1.id = 1;
//		product1.name = "volley ball";
//		product1.unitPrice = 1150;
//		product1.discountedPrice = 1000;
//		
//		Product product2 = new Product();
//		product2.id = 2;
//		product2.name = "volley ball 2";
//		product2.unitPrice = 1450;
//		
//		Product product3 = new Product();
//		product3.id = 3;
//		product3.name = "volley ball 3";
//		product3.unitPrice = 1750;
//		
//		Product[] products = new Product[] {product1, product2, product3};
//		product2 = product1;
//		product1 = product3;
//		product1.name = "Elma";
//		System.out.println(products[1].name);
		

	}

}
