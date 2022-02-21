package miniProjects;

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =12;
		int sum =0;
		int number2 =284;
		int sum2 =0;
		
		for(int i=1;i<number;i++) {
			
			if(number % i == 0) {
				
				sum=sum+i;
			}
			
			
		}
				
		for(int j=1 ; j<number2;j++) {
			
			if(number%j==0) {
				
				sum2=sum2+j;
				
			}
			
		}
				
		
		if(number==sum2 && number2==sum) {
			
			System.out.println(number + "ve" + number2 + " arkadaþ sayýdýr");
			
		}else {
			
			System.out.println(number + "ve" + number2 + " arkadaþ sayý deðildir");
			
		}
		
		
		

	}

}
