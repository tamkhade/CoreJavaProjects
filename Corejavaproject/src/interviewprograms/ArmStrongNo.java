package interviewprograms;

public class ArmStrongNo {
	
	public static void main(String[] args)
	{
		int input =153;
	  
		int r;
		int sum=0;
		
		int temp;
		temp=input;
		
		while(input>0)
		{
			r=input%10;
			sum=sum+(r*r*r);
			input=input/10;
		}
		if(temp==sum)
		{
			System.out.println("armstrong no");
		}
		
		
	}

}
