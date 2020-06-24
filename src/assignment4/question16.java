package assignment4;

import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		//16.	Write a program to find the given number is even or odd.

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		int evenNum= num%2;
		
		if (evenNum == 0) {
			System.out.println("It is an even number...");
			
		}
		else {
			System.out.println("it is an odd number..");
			
		}
		System.out.println("End of program...");
		
		
	}

}
