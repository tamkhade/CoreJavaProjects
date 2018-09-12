package interviewprograms;

public class StringSubStringmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
     String s1="java programming";
   
     String s2=s1.substring(5);
     System.out.println(s1.length());
        s1=s1.substring(0, 5)+s1.substring(5,9);
        System.out.println(s1);/**
    	 * output is java prog
    	 */
        System.out.println(s2);/**
    	 * output is programming
    	 */
		
		
	}

}
