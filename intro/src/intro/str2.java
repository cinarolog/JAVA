package intro;

public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg="Aðaç yaþken eðilirmiþ haberin olsun :) ";
		
		String msg2 = msg.replace(" ", "**");
		System.out.println(msg2);
		System.out.println(msg.substring(2,17));

		System.out.println("************");
		
		for(String kelime : msg.split(" ")) {
			
			System.out.println(kelime);
		}
		
		
		//trim
		//toUppercase
		//toLowercase
		
		
		
		
		
		
		
		
	}

}
