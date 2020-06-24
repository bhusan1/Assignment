package assignment6;

import java.util.Scanner;

public class question24 {

	public static void main(String[] args) {
		// 24.	Write a program to print the factorial number of given numbers.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = input.nextInt();
	
		int fac = 1;
		
		
		for (int i = 1; i<=num; i++){
			fac = fac* i; 
			
		}
		System.out.println("The factorial is: ");
		System.out.println(fac);
		
		 
		System.out.println("End of program!!!");
		input.close();
	

	}

}
