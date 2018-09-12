/**
 * 
 */
package interviewprograms;

/**
 * @author Tamkhade
 *
 */
public class StringSplitmeCountdublicateWord {

	/**
	 * @CountWordUsingSplitMethod
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="mahesh mahesh tamkhade tamkhade";
		String s1[]=s.split("\\s");
		int duplicatecount=0;
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					/**
					 * @passing 0 to remove the duublicate and print the single word
					 */
					s1[j]="0";
					duplicatecount++;
				}
			
			}
			/**
			 * when condition is true only i!=0 value is printed
			 */
			
			if(s1[i]!="0")
			System.out.println(s1[i]+"   word count "+duplicatecount);
		}
		

	}

}
