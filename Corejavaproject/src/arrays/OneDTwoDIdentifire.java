package arrays;

public class OneDTwoDIdentifire {

	
	public static void twodarray(int[]...z)//u can define 2D array like this
	{
		
		for(int[] x1:z)
		{
			
			System.out.println(x1[0]);
		}
		
	}
	
	public static void onedarray(int...f)// one d array using u can iterate array
	{
		
		for(int x:f)
		{
			
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args)
	{
		
		int a[]={10,20,30};
		int b[]={40,50,60};
		twodarray(a,b);//calling static method
		onedarray(a);//calling sattaic method
		
	}
	
	
}
