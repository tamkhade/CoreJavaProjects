package arrays;

public class ArraysDecleration {
	//follow this step
	
	//byte-short-int-long-float-double
	            //|
	           //char
	
	public static void main(String[] args)
	{
	//1D arrays define
	int[] x;//recommended to use
	
	int []z;
	
	int f[];
	
	//int[5] s;//compile time Error
	
	int n[]=new int[3]; //create n type array
	//array with zero size
	int a[]=new int[0];
	int v=a.length;//you can declare array length
	
	//negative array size exception
	int[]d=new int[-2];//runtime exception
	
	//following are valid 
	//int[] q=new int[];//compile time error
	int[]g=new int[9];//no any error
	int[][] w=new int[3][3];//no compile time error
	int[][] l=new int[2][];
	int[] k={1,2,3};
	//new int[] {1,2,3};compile time error
	
//	int[][] h=new int[][8];//compile time error
	
	
	}
	


}
