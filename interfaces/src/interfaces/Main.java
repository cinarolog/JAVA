package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers = {new SmsLogger() ,  new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer cinar =  new Customer(1,"Muhammet","��nar");
		Customer omerfg = new Customer(2,"�mer Faruk" , "Gerzeli");

		
		customerManager.add(cinar);
		System.out.println("*****");
		customerManager.delete(omerfg);
		
		
		
		

	}

}
