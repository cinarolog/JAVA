package polymorphismDemo;

public class CustomerManager {

	private BaseLogger logger;
	
	//constructor
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
		
	}
	
	
	public void add() {

		System.out.println(" M��teri Eklendi : ");
		
		//DatabaseLogger logger = new DatabaseLogger();
		//logger.Log("Log meaj� :");
		
		this.logger.log("Log mesaj� : ");
		
	}

	
	
	
	
	
	
	public void delete() {

		System.out.println(" M��teri Silindi : ");

	}

	public void update() {

		System.out.println(" M��teri G�ncellendi : ");

	}

}
