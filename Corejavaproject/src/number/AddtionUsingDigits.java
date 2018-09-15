package number;

import java.util.Scanner;

//Given an integer number and we have to find addition of all digits using java.

public class AddtionUsingDigits {

	public static void main(String args[]) {
		System.out.println("Enter your no");
		Scanner sc = new Scanner(System.in); 
		int number = sc.nextInt();
		int sum =0;

		while(number>0){
			final int last_digit  = number%10;
			sum = sum + last_digit ;
			number = number/10; 
		}
		System.out.println("Sum of all digit value is "+sum);

	}
}
