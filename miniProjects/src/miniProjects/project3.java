package miniProjects;

public class project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =6;
		int sum =0;
		
		for(int i=1;i<number;i++) {
			
			if(number % i == 0) {
				
				sum=sum+i;
			}
			
			
		}
		
		if(sum==number) {
			
			System.out.println(sum + " Mükemmel sayýdýr");

	}else {
			
			System.out.println(sum + ": Mükemmel sayý deðildir");
		}

	}

}
