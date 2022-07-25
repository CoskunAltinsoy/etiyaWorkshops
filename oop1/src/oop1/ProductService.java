package oop1;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	public void add(Product product) {
		System.out.println(product.getName()+"eklendi");
	}
	
	public void delete(Product product) {
		System.out.println(product.getName()+"silindi");
	}
	
    public void update(Product product) {
    	System.out.println(product.getName()+"güncellendi");
	}
    
    public List<Product> getAll(){
    	return new ArrayList<Product>(); 
    }
}
