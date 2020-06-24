package assignment6;

import java.util.Scanner;

public class question22 {

	public static void main(String[] args) {
		// 22.	Write a program to print the table of given number.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find multiplication table: ");
		int num = input.nextInt();
	
		System.out.println("Multiplication Table of: "+ num);
		for (int i = 1; i<=10; i++){
			int mul = i * num;
			System.out.println(num + "*" + i+ " = "+ mul);
		}
		
		 
		System.out.println("End of table!!!");
		input.close();
	}

}
