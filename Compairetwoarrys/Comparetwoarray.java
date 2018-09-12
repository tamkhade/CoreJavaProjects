package com.string.project;

import java.util.Arrays;
import java.util.Scanner;

public class Comparetwoarray {

	
	
	private void compare()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the value 1 st");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the size of an array");
		int ab=sc.nextInt();
		int b[]=new int[ab];
		System.out.println("Enter the value of 2nd");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
			
		}
		
		if(Arrays.equals(a, b))
		{
			System.out.println("success");
		}else
		{
			
			System.out.println("error");
		}
		
	}
	
	public static void main(String args[])
	{
		Comparetwoarray a=new Comparetwoarray();
		a.compare();	
		
	}
	
}
