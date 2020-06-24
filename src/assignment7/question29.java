package assignment7;

import java.util.Scanner;

public class question29 {
	// make a number/factorial --> 1/1!+2/2!+3/3!+4/4!+n/n!
	
	public static int factorial(int num) {
		
		int fac = 1;
		for (int i = 1; i<=num; i++){
			fac = fac* i; 	
		}
		return fac;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
		
		int sum = 0;
		
		for (int i =1; i <= num; i ++) {
			sum = sum + (i / factorial(i));
			
		}
		System.out.println("Sum of nth series is: " + sum);
		input.close();
	}

}
