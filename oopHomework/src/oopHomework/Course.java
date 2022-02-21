package oopHomework;

public class Course {
	
	
	public Course(){
		
		System.out.println("instructor : Engin Hoca");  
	}
	
	public Course(int id,String name,double price) {
		
		this();
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	int id;
	String name;
	double price;

}
