package assignment4;

import java.util.Scanner;

public class question13 {

	public static void main(String[] args) {
		// 13.	Write a program to print the number entered by user only
		//if the number entered is negative.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a negative number: ");
		int num = input.nextInt();
		
		if (num >= 0) {
			System.out.println("Please enter a negative Number");
			
		}
		else {
			System.out.println("The number is: " + num);
			System.out.println("Thank you.");
		}
		System.out.println("Run your code again.");
		System.out.println("Exit!!");

	}

}
