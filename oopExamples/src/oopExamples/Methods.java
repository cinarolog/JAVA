package oopExamples;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj="bugun hava cok guzel";
		String newmsg= sehirVer();
		System.out.println(newmsg);
		
		int sayi=topla(35,44);
		System.out.println(sayi);
		
		int toplam=topla2(1,2,3,4,5,6,7,8,9);
		System.out.println(toplam);


	}
	
	
	
	//
	
	public static void add() {
		
	}
		
	public static void delete() {
			
		}
	
	public static void update() {
		
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
		
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
