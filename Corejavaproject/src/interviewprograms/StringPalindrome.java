package interviewprograms;

public class StringPalindrome {

	public static void main(String[] args)
	{
		String z="pap";
		
		int l=z.length();
		String s="";
		for(int i=l-1;i>=0;i--)
		{
			s=s+z.charAt(i);	
		}
		
		if(z.equals(s))
		{
			System.out.println("String is palindrome");
			
		}else
		{
			System.out.println("String is not palindrome");
					
		}
	}
	
	

}
