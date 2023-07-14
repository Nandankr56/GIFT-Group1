/* Print all multiplication tables from 2 to 10? Five tables are supposed to
        be arranged horizontally and subsequently five more in the next row horizontally
        and so on.
        */

  public class multipletable {


	public static void main(String[] x) {
		
		
		System.out.println();
		for(int h=2; h<=10; h+=5) {
			for(int i=1; i<=10; i++) {
				for(int j=h; j<=(h+3); j++) {
					System.out.print(pad(j,2)+" x "+pad(i,2)+" = "+pad((j*i),3)+"  ");
					if(j>=12) break;
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static String pad(int n, int len) {
		String Val = ""+n;
		for(int i=Val.length(); i<len; i++) {
			Val = " "+Val;
		}
		return Val;
	}
}
