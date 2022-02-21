package intro;

public class for_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		for(int i=0;i<10;i++) {
			
			System.out.println(i);
			
			
			
			
	// example
			int sayi = 1234, tersi = 0;
	        int yedek=sayi;
	 
	        for(;sayi != 0; sayi /= 10) {
	            int basamak = sayi % 10;
	            tersi = tersi * 10 + basamak;
	        }
	        System.out.println("Sayýnýn      : " + yedek);
	        System.out.println("Sayýnýn Tersi: " + tersi);
		}

	}

}
