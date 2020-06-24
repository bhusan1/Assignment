package assignment3;

import java.util.Scanner;

public class question9 {

	public static void main(String[] args) {
		
		/*9.	Write a program that converts pounds into kg.
		 *  The program prompts the user to enter number of 
		 *  pounds, converts it to kg and displays the result 
		 *  [1 pound is 0.454 kg].
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds: ");
		
		float weight = input.nextFloat();
		
		float wkg = (float)(weight*0.454);
		
		System.out.println("Weight in kg is: " + wkg +" kg");
		

	}

}
