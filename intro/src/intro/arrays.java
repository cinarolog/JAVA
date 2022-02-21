package intro;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double [] mylist= {1.2,2.3,4.5,5.6,8};
		double sum=0;
		
		for(double number:mylist) {
			
			sum = sum + number;
			
			
		}
		System.out.println("Summation: "+sum);
		
		System.out.println("***********");
		
		////
		
		double [] mylist2= {1.2,2.3,4.5,5.6,8};
		double sum2=0;
		
		for(int i=0;i<mylist2.length;i++) {
			
			sum2 = sum2 + mylist2[i];
			
			
		}
		System.out.println("Summation2: "+sum2);
		
		System.out.println("***********");
		
		///
		
		double [] mylist3= {1.2,2.3,23,4.5,5.6,8};
		double total=0;
		double max =mylist3[0];
		
		for(double number:mylist3) {
			
			if(max<number) {
				
				max=number;
			
			}
			total = total + number;
			
		}
		System.out.println("total: "+total);
		System.out.println("max : "+max);
		
		System.out.println("***********");
		
	
	}

}
