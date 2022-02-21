package intro;

public class ReCap_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=30;
		int c=12;
		int biggest;
		
		if(a>b) {
			if(a>c) {
				biggest=a;
				
			}
			else{
				biggest=c;
			}
		}
		
		else {
			if(b>c) {
				biggest=b;
			}
			else {
				biggest=c;
			}
		}
		
		
		System.out.println(biggest);

	}

}
