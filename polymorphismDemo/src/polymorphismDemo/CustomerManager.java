package polymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;
	
	//constructor
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		
	}
	
	
	public void add() {

		System.out.println(" Müþteri Eklendi : ");
		
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.Log("Log meajý :");
		
		this.logger.log("Log mesajý : ");
		
	}

	
	
	
	
	
	
	public void delete() {

		System.out.println(" Müþteri Silindi : ");

	}

	public void update() {

		System.out.println(" Müþteri Güncellendi : ");

	}

}
