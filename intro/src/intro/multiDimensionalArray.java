package intro;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [][] sehirler= new String[3][3];
		
		sehirler[0][0]="istanbul";
		sehirler[0][1]="düzce";
		sehirler[0][2]="adana";
		sehirler[1][0]="izmir";
		sehirler[1][1]="agrý";
		sehirler[1][2]="sakarya";
		sehirler[2][0]="mykj";
		sehirler[2][1]="bolu";
		sehirler[2][2]="ankara";
		
		
		for(int i=0;i<=2;i++) {
			
			System.out.println("*****************");
			for(int j=0;j<=2;j++) {
				
				 System.out.println(sehirler[i][j]);
			}
			
		}
		
		
	}

}
