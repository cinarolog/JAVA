package intro;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg="kosalgosa gel yanýma";
		
		System.out.println("index :"+ msg.length());
		System.out.println("5.index :"+ msg.charAt(5));
		
		System.out.println("************");
		
		System.out.println(msg.concat(" Yürü bee"));
		System.out.println(msg);
		
		System.out.println("************");
		
		System.out.println(msg.startsWith("k"));
		System.out.println(msg.endsWith("c"));
		
		System.out.println("************");
		char [] karakterler=new char[5];
		
		msg.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println("************");
		
		System.out.println(msg.indexOf("n"));
		System.out.println(msg.indexOf("an"));
		System.out.println(msg.indexOf("ný"));
		System.out.println(msg.lastIndexOf("ný"));
		System.out.println("************");
		
		
		
		
		
		
		
		

	}

}
