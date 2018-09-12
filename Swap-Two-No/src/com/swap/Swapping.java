package com.swap;

import java.util.Scanner;

public class Swapping {
	int a,b;
	
	
	
	public void swap(){	
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		
		b=sc.nextInt();	
		
	int temp;
	temp=a;
	a=b;
	b=temp;	
	  System.out.println("value of b is "+b);
	  System.out.println("value of a is "+a);
	}
	public static void main(String[] args) {
  Swapping swap1=new Swapping();
  swap1.swap();

	}

}
