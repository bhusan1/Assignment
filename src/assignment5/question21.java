package assignment5;

import java.util.Scanner;

public class question21 {

	public static void main(String[] args) {
		// 21.	Program to input the number of (1...7) and 
		//translate to its equivalent name of the day of the
		//week.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 1-7: ");
		int day = input.nextInt();
		
		if (day == 1 ) {
			System.out.println("Sunday!!");
		}
		else if (day == 2 ) {
			System.out.println("Monday!!");
		}
		else if (day == 3 ) {
			System.out.println("Tuesday!!");
		}
		else if (day == 4 ) {
			System.out.println("Wednesday!!");
		}
		else if (day == 5 ) {
			System.out.println("Thrusday!!");
		}
		else if (day == 6 ) {
			System.out.println("Friday!!");
		}
		else {
			System.out.println("Saturday!!!");
		}

		System.out.println("Have a good day!!");
	}

}
