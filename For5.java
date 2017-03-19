package Exercise;

public class For5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int rc=1,spacecounter=1,starcounter=5;
		for(int i=3;i>=1;i--){
			System.out.println() ;
			for(int j=1;j<=spacecounter;j++)
				System.out.print(" ");
			for(int k=1;k<=starcounter;k++)
				System.out.print("*");
			spacecounter=spacecounter+1;
			starcounter=starcounter-2;
		}
		// TODO Auto-generated method stub

	}

} 
