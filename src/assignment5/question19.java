package assignment5;

import java.util.Scanner;

public class question19 {

	public static void main(String[] args) {
		// 19.	Write a Program to accept three sides of triangle
		//and display which kind of triangle is formed.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Side A: ");
		int A = input.nextInt();
		System.out.println("Enter Side B: ");
		int B = input.nextInt();
		System.out.println("Enter Side C: ");
		int C = input.nextInt();
		
		if (A == B && B == C) {
			System.out.println("The triangle is equilateral triangle");
		}
		else if (A==B || A== C || B==C) {
			System.out.println("The triangle is isosceles triangle");
		}
		else {
			System.out.println("The triangle is acute or obselete triangle");
		}
		System.out.println("End of program...");
		
	}
		
	

}
