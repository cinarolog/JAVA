package oopHomework;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course course1= new Course(); //referans, instance ornek olusturma
		course1.id=1;
		course1.name="Java-React";
		course1.price=10000;
		
		Course course2=new Course();
		course2.id=2;
		course2.name="C#-Angular";
		course2.price=2000;
		
		//Course course3=new Course(3,"Javascript",1234);
		
		Course[] courses= {course1,course2};
		
		//foreach
		
		for (Course course : courses) {
			
			System.out.println(course.id);
			System.out.println(course.name);
			System.out.println(course.price);
		}
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
