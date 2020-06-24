package assignment6;

import java.util.Scanner;

public class question23 {

	public static void main(String[] args) {
		// 23.	Write a Program to sum 1 to nth natural numbers.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
	
		int sum = 0;
		System.out.println("Sum from 1 to nth number is: ");
		
		for (int i = 1; i<=num; i++){
			sum = sum + i; 
			
			System.out.println(sum);
		}
		
		 
		System.out.println("End of table!!!");
		input.close();
	}

}


