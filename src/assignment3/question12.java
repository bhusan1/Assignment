package assignment3;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		/*12.	Write a program to accept the roll, name, 
		 * and nationality of the person and display those 
		 * values in good format way.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = input.nextLine();
		
		System.out.println("Enter Nationality: ");
		String nationality = input.nextLine();
		
		System.out.println("Enter roll: ");
		int roll = input.nextInt();
		
		System.out.println("==========");
		System.out.println("Name is: "+ name);

		System.out.println("Roll is: "+ roll);
		System.out.println("Nationality is: " + nationality);
		System.out.println("===========");

	}

}
