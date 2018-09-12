package operatorandassignement;

public class ImplicitTypeCasting {
//compiler is responsible for this casting
	//byte-short-int-long-float-double
	//         |
	          //char
	
	public static void main(String[] args)
	{
		
		int a='n';//here is compiler implictly cast thesmaller primitive to bigger primitive
		System.out.println(a); //output is 110
	}
}
