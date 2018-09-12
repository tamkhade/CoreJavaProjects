/**
 * 
 */
package interviewprograms;

/**
 * @author @Tamkhade
 *
 */
public class TringleAscendingOrderStar {

	/**
	 * @print @Star
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=5;
		
		for(int i=0;i<input;i++)
		{
			
			for(int k=0;k<input-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			
			System.out.println();
			
		}
		
		
	}

}
