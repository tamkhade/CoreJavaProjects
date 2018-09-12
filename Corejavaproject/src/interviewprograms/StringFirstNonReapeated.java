package interviewprograms;

public class StringFirstNonReapeated {
	
	public static void main(String[] args)
	{
		String s="mahesh";
		char[] c=s.toCharArray();
		boolean flag=true;
		int index=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(i==j)
				{
					continue;
				}else 	
				{
					if(c[i]==c[j])
					{
				flag=false;
						break;
					}else
					{
						flag=true;
			   			index=i;
			   			
					}
					
				}
					
			}
				
			if(flag)
			{
			System.out.println("first non reated char "+c[index]);
			break;
			}
		}
		
		
	}
	
}
