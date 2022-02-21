package intro;

import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Klavyeden okuma yapmak için Scanner nesnesini oluþtur.
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Bir Sayý Girin: ");
 
        // nextInt() metodu ile tam sayý türünde deðer okumasý yapýlýr.
        int ayDegeri = reader.nextInt();
 
        // println() metodu ile ekrana sayi içindeki deðer yazdýrýlýr.
        System.out.println("You entered: " + ayDegeri);
		
		//Secilen ay degeri
        //int ayDegeri = 7;
        //Yazdirilacak ay degeri
        String ayDegeriStr = null;
 
        //switch - case ile hanig ayýn hangi sayýya denk geldiginin belirtildigi bolum
        switch(ayDegeri) {
            case 1:
                ayDegeriStr = "Ocak";
                break;
            case 2:
                ayDegeriStr = "Þubat";
                break;
            case 3:
                ayDegeriStr = "Mart";
                break;
            case 4:
                ayDegeriStr = "Nisan";
                break;
            case 5:
                ayDegeriStr = "Mayýs";
                break;
            case 6:
                ayDegeriStr = "Haziran";
                break;
            case 7:
                ayDegeriStr = "Temmuz";
                break;
            case 8:
                ayDegeriStr = "Aðustos";
                break;
            case 9:
                ayDegeriStr = "Eylül";
                break;
            case 10:
                ayDegeriStr = "Ekim";
                break;
            case 11:
                ayDegeriStr = "Kasým";
                break;
            case 12:
                ayDegeriStr = "Aralýk";
                break;
            default:
                break;
        }
        //Konsol ekranina secilen ayin yazdirildigi bolum
        System.out.println("Seçilen Ay Deðeri: " + ayDegeriStr);
		
		
		

	}

}
