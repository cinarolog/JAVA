package polymorphismDemo;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Çok biçimlilik
		
		/*
		 * BaseLogger[] loggers = new BaseLogger[] { new FileLogger(),new EmailLogger(),
		 * new DatabaseLogger(),new ConsoleLogger()};
		 * 
		 * for (BaseLogger logger : loggers) {
		 * 
		 * logger.Log(" : message"); }
		 */
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		
		customerManager.add();
		
		
		
		
		
		

	}

}
