package assignment4;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		// 15.	Write a program that receives an ASCII code 
		//(between 0 – 128) and display its character
		//[example: 97 (input) ->a(output)].

		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		
		char c = (char) num;
		
		System.out.println("the character of entered number is: "+ c);
		input.close();
	}
	
	

}
