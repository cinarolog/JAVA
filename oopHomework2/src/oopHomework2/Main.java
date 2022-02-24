package oopHomework2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		Person person = new Person();
		
		CustomerManager customerManager = new CustomerManager();
		EmployeeManager  employeeManager = new EmployeeManager();
		PersonManager personManager = new PersonManager();
		
		System.out.println("***Customer***");
		
		customerManager.add();
		customerManager.List();
		customerManager.BestCustomer();
		
		System.out.println("***Employee***");
		
		employeeManager.add();
		employeeManager.List();
		employeeManager.BestEmployee();
		
		System.out.println("***Person***");
		
		personManager.add();
		personManager.List();
		
		
		

	}

}
