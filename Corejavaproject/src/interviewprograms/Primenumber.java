package interviewprograms;

public class Primenumber {

	public static void main(String[] ags)
	{
		int a=11;
		int m=a/2;
		int flag=0;
		if(a==0||a==1)
		{
			
			System.out.println("not prime no");
		}else
			for(int i=2;i<m;i++)
			{
				if(a%i==0)
				{
					System.out.println("not prime no");
					
					flag=1;
				}
				
			}
		
		if(flag==0)
		{
			System.out.println("this is prime no");
		}
		
	}
	
}
