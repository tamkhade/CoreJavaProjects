package interviewprograms;

import java.util.Arrays;

public class StringAngaram {
	
	public static void main(String[] args)
	{
		String s="peek";
		String b="keep";
		char[] c1=s.toCharArray();
		char[] c2=b.toCharArray();
		String z=new String("");
		boolean flag=false;
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		flag=Arrays.equals(c1, c2);
		if(flag)
		{
			System.out.println("string is anagram");
		}else
		{
			
			System.out.println("string is not anagram");
		}
		/*for(int i=0;i<c1.length;i++)
		{
			for(int j=0;j<c2.length;j++)
			{
				if(c1[i]==c2[j])
				{
					flag=true;
					break;
					char c=s.charAt(i);
					System.out.println(c);
					z=z+s.charAt(i);
					//System.out.println(z);
					
				}else
				{
				flag=false;	
					break;
				}
				
			}
			
		}
		*/
		System.out.println(z);
		if(s.equals(z))
		{
			System.out.println("string is anagram");
			
		}
		
	}

}
