package Exercise;

public class For4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int r=1,spacecounter=4,starcounter=1;
		for(int i=1;i<=5;i++){
			System.out.println( );
			for(int j=1;j<=spacecounter;j++)
				System.out.print(" ");
			for(int k=1;k<=starcounter;k++)
				System.out.print("*");
			spacecounter--;
			starcounter=starcounter+2;
		}
		
		// TODO Auto-generated method stub

	}

}
