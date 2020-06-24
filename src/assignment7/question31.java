package assignment7;

import java.util.Scanner;

public class question31 {
	// display pattern 1 || 12|| 123|| 1234|| 12345||
	
	public static void printNum(int num) {
		int i, u, v;
		
		for (i = 0; i <= num; i++) {
			
			u = 1;
			
			for (v = 0; v < i; v++) {
				System.out.print(u + "");
				
				u++;
			}
			System.out.println();
		}
	
	}
	

	public static void main(String[] args) {
		
	
		System.out.println("Enter a number to print pattern table: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		printNum(num);
		
	}

}
