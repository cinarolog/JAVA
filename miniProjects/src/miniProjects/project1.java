package miniProjects;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number=29;

		
		boolean isPrime=true;
		
		for(int i=2;i<number;i++) {
			
			if(number%i==0) {
				
				isPrime=false;
				
			}
		
		}
		
		if(isPrime) {
					
					System.out.println("Say� Asald�r : ");
				}
				
				else {
					System.out.println("Say� Asal de�ildir :");
				}
		
		
		
		
		

	}

}
