package assignment2;

import java.util.Scanner;

public class question8 {

	public static void main(String[] args) {
		
		/*8.	Write a program to convert Fahrenheit to 
		 * Celsius and Celsius to Fahrenheit.
		 * 
		 */
		
		//F to C
		
		Scanner value = new Scanner (System.in);
		
		
		System.out.println("Enter temperature in Fahrenheit: ");
		float f = value.nextFloat();

		//(f - 32) * 5/9 = C
		
		float c = ((f - 32)* 5)/9;
		
		System.out.println("Temperature in Celcius is: " + c);
		
		//C to F
		
		System.out.println("Enter temperature in Celsius: ");
		float c1 = value.nextFloat();
		
		//(C * 9/5) + 32 = F
		
		float f1 = (c1 * (9/5)) + 32;
		
		System.out.println("Temperature in Fahrenheit is: "+ f1);
				
	}

}
