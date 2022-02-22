package oopExamples;

public class classProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product product1= new Product();	
		product1.name="Monster";
		product1.setId(1);
		product1.price=10000;
		product1.stockAmount=12;
		
		Product product2= new Product();
		product2.name="msi";
		product2.id=2;
		product2.price=12000;
		product2.stockAmount=15;
		
		
		Product[] products= {product1,product2};
		
		for (Product product : products) {
			
			System.out.println(product.name + product.id);
		}
		
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product1);
		productManager.delete(product2);
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
}
