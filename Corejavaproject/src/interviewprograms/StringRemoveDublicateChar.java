package interviewprograms;

public class StringRemoveDublicateChar {
	
	public static void main(String[] args)
	{
		String s="mahesh";
		String z="";
	
		char[] c=s.toCharArray();
		         
		for(int i=0;i<s.length()-1;i++)
		{
			if(c[i]==c[i+1])
			{
				break;
			}else
			{
				z=z+s.charAt(i);
			}
			
		}
		
		System.out.println(z);	
	}
	
}
