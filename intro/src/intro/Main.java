package intro;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//camelCase
		// Dont repeat yourself
		String internetSubeButonu="�nternet �ubesi";
		double dolarDun=8.25;
		double dolarBugun =8.25;
		int vade=36;
		boolean dustuMu=false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun < dolarDun) {
			
			System.out.println("Dolar D��t�");
		}else if(dolarBugun > dolarDun) {
			System.out.println("Dolar Y�kseldi");
		}
		else {
			System.out.println("Ayn�");
		}
		
		
		String Kredi1 ="H�zl� kredi";
		String Kredi2 ="Mutlu emekli kredisi";
		String Kredi3 ="Konut Kredisi";
		String Kredi4 ="�ift�i Kredisi";
		String Kredi5 ="MSB kredisi";
		String Kredi6 ="Halk kredisi";
		
		String[] krediler = 
			{       "H�zl� kredi",
					"Mutlu emekli kredisi",
					"Konut Kredisi",
					"�ift�i Kredisi",
					"MSB kredisi",
					"Halk Kredisi"
			};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
			
		}
		
		System.out.println("********");
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		// De�er ve Referans Tipler
		
		//De�er tip int float double boolean
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		
		System.out.println(sayi1);//20
		
		//Referans tip array class interface abstract class
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);//100
		
		String sehir1="Ankara";
		String sehir2="�stanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);//istanbul
		
		
		
		
		
		
		
		
		
	}

}
