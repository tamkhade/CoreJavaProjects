package flowcontrol;


public class IterativeStatement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20; int c=10;
		
		//use while loop
		while(a>c)
		{
			System.out.println("hiii");
			break;
		}
		//use dowhile loop
		
		do
		{
			int x=2;
			System.out.println(x);
			break;
		}while(true);

		//use for loop
		
		for(int i=0;i<2;i++)
		{
			
			System.out.println("use two times");
		}
		
		//use for Each loop
		int[] s={1,2,3,4};
		for(int d:s)
		{
			
			System.out.println(d);//using for each loop u can iterate this value
		}
		

	}

}
