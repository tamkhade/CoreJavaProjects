package interviewprograms;

public class Palindromeno {

	public static void main(String[] args)
	{
		int n=454;
		int sum=0;
		int r;
		int temp;
		temp=n;
		 while(n>0)
		 {
           r=n%10;
           sum=r+(sum*10);
           n=n/10;
			 
		 }
		 
		 if(temp==sum)
		 {
			 
			 System.out.println(" is palindrome");
		 }else
			 
		 {
			 System.out.println("not palindrome");
		 }
	}
	
}
