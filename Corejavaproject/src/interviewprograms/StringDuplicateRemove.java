package interviewprograms;

public class StringDuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mahesh";
		String x="";
		String n="";
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					x=x+s.charAt(i);
					
				}
				else
				{
					n=n+s.charAt(i);
					break;
				}
				
			}
			
		}

		//System.out.println(n);
		System.out.println(x);
	}

}
