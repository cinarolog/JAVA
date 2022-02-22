package oopExamples;

public class Main {

	public static void main(String[] args) {
		// Main
		
		sayiBul();
		
		
	}
	
	
	//sayiBul methodu
	public static void sayiBul() {
		
		int [] sayilar = new int[] {1,7,3,4,77,2};
		int bul=4;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			
			if(sayi==bul) {
				varMi=true;
				break;
			}
			
		}
		
		if(varMi) {
			mesajVer("Sayý mevcuttur: "+ bul);
		}else {
			System.out.println("Sayý mevcut deðil: "+ bul);
		}
	
	}
	
	
	//mesajVer parametreli methodu
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
		
	}
	
	
	
	
	
	

}
