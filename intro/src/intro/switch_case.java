package intro;

import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Klavyeden okuma yapmak i�in Scanner nesnesini olu�tur.
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Bir Say� Girin: ");
 
        // nextInt() metodu ile tam say� t�r�nde de�er okumas� yap�l�r.
        int ayDegeri = reader.nextInt();
 
        // println() metodu ile ekrana sayi i�indeki de�er yazd�r�l�r.
        System.out.println("You entered: " + ayDegeri);
		
		//Secilen ay degeri
        //int ayDegeri = 7;
        //Yazdirilacak ay degeri
        String ayDegeriStr = null;
 
        //switch - case ile hanig ay�n hangi say�ya denk geldiginin belirtildigi bolum
        switch(ayDegeri) {
            case 1:
                ayDegeriStr = "Ocak";
                break;
            case 2:
                ayDegeriStr = "�ubat";
                break;
            case 3:
                ayDegeriStr = "Mart";
                break;
            case 4:
                ayDegeriStr = "Nisan";
                break;
            case 5:
                ayDegeriStr = "May�s";
                break;
            case 6:
                ayDegeriStr = "Haziran";
                break;
            case 7:
                ayDegeriStr = "Temmuz";
                break;
            case 8:
                ayDegeriStr = "A�ustos";
                break;
            case 9:
                ayDegeriStr = "Eyl�l";
                break;
            case 10:
                ayDegeriStr = "Ekim";
                break;
            case 11:
                ayDegeriStr = "Kas�m";
                break;
            case 12:
                ayDegeriStr = "Aral�k";
                break;
            default:
                break;
        }
        //Konsol ekranina secilen ayin yazdirildigi bolum
        System.out.println("Se�ilen Ay De�eri: " + ayDegeriStr);
		
		
		

	}

}
