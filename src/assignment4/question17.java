package assignment4;

import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
		// 17.	Write a program to calculate leap year.
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which year is it? (YYYY) : ");
		int year = input.nextInt();
		
		//leap year are exactly divisible by 4 except
		//century years like 2000 or 1600 which is divisible by 400
		
		boolean leapYear = false;
		
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {//for century years
				if (year % 400 == 0) {//for leap century years
					
					leapYear = true;
				}else {
					leapYear= false;
					
				}
				
			}
			else {
				leapYear = false;
			}
			
		}
		else {
			leapYear = false;
		}
		
		if (leapYear) {
			System.out.println("it is a leap year... "+ year );
		}
		else {
			System.out.println("it is not a leap year.. " + year);
		}

	}

}
