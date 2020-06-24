package assignment4;

import java.util.Scanner;

public class question14 {

	public static void main(String[] args) {
		// 14.	Write a program to relate two integers entered by 
		//user using = =or > or < sign.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program compares 2 numbers.");
		System.out.println("Enter first integer a : ");
		int a = input.nextInt();
		System.out.println("Enter second integer b : ");
		int b = input.nextInt();
		
		if (a==b) {
			System.out.println(" a and b are equal.");
			
		}
		else if(a > b) {
			System.out.println("a is greater than b.");
			
		}
		else {
			
			System.out.println("b is greater than a.");
		}

	}

}
