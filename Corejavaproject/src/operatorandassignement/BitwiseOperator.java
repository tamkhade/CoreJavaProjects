package operatorandassignement;

public class BitwiseOperator {
	public static void main(String args[]){  
		int a=10;  
		int b=5;  
		int c=20;
		
		if(c<22)
		{
			c+=7;
			
			
		}
		System.out.println(c);
		
		Double d=Math.random();
		System.out.println(d);
		System.out.println(a<b&a++<c);//false &true = false  
		System.out.println(a);//11 because second condition is checked 
		System.out.println(a<b|a<c);//true
	}

}
