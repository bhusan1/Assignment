package assignment2;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		
		/* 4.	Write a program to calculate Simple Interest 
		input by user. Simple Interest = P*T*R/100
		*/
		
		Scanner input = new Scanner( System.in);
		
		System.out.println("Enter Principle Amount: ");
		int P = input.nextInt();
		
		System.out.println("Enter Time: ");
		int T = input.nextInt();
		
		System.out.println("Enter Rate: ");
		int R = input.nextInt();
		
		float SI = (float) ( P*T*R)/100;
		System.out.println("The Simple Interest is " + SI);
		
	}

}
