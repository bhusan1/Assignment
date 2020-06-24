package assignment6;

import java.util.Scanner;

public class question28 {
	
	// 28.	Write a program in single class having the 
			//following functions.
			//a.	isPrimenumber(int)
			//b.	firstNthPrime(int )
			//c.	allPrimebetween(int start , int  end)
	
	public void isPrime(int n) {
		
		boolean isPrimeNumber = true;
		
		for (int i = 2; i<= n/2 ; i++) {
			if (n % i == 0) {
				isPrimeNumber = false;
				break;
				
			}
		}
		
		if (isPrimeNumber) {
			System.out.println(n + " is a prime number.");
		}else{
			System.out.println(n + " is not a prime number");
					
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to find prime or not: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
			
		question28 ob = new question28();
		ob.isPrime(n);
		input.close();
	

	}

}
