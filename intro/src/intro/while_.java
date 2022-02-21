package intro;
import java.util.Scanner;
public class while_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      
		        Scanner reader = new Scanner(System.in);
		        
		        System.out.print("Bir Sayý Girin: ");
		 
		 
		        int num = reader.nextInt();
		 
		        int adet = 0,toplam=0;
		 
		        while(num != 0)
		        {
		           toplam=(num%10)+toplam;
		           num /= 10;
		            ++adet;
		        }
		 
		        System.out.println("Basamak Toplamý: " + toplam);

	}

}
