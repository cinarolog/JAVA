package inheritance;

public class Main {

	public static void main(String[] args) {

		// Miras

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "78970";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { engin, abc, hepsiburada };

		customerManager.addMultiple(customers);
		System.out.println("*********");

		// customerManager.add(hepsiburada);
		// customerManager.add(engin);
		// customerManager.add(abc);

	}

}
