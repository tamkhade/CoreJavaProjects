package interviewprograms;

public class Fibbonaciseries {

	public static void main(String[] args)
	{
		int input=10;
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<input;i++)
		{
			int c=a+b;
			   System.out.print(" "+c);
			   a=b;
			   b=c;
			 
		}
		
		
	}
	
}
