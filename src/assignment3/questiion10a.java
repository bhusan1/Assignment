package assignment3;

import java.util.Scanner;

public class questiion10a {

	public static void main(String[] args) {
		
		
		System.out.println("This is a program to find distance ");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial velocity: ");
		double u = input.nextDouble();
		
		System.out.println("Enter time taken: ");
		double t = input.nextDouble();
		
		System.out.println("Enter acceleration: ");
		double a = input.nextDouble();
		
		double s = (u*t)+((0.5)*(a*(Math.pow(t, 2))));
		
		System.out.println("This is Distance travelled: " + s + " units");
		
		
	}

}
