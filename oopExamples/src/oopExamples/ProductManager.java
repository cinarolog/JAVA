package oopExamples;

public class ProductManager {
	
	public void add(Product product) {
		
		System.out.println("added:" + product.name);
		
	}
		
	public void delete(Product product) {
			
		System.out.println("deleted:" + product.name );
		}
	
	public void update(Product product) {
		
		System.out.println("updated:" + product.name);
	}



}
