package assignment5;

import java.util.Scanner;

public class question20 {

	public static void main(String[] args) {
		/* 20.	Write a program to create the equivalent of a 
		 * four-function calculator. The program to enter two 
		 * integer’s numbers and an operator. It then carries out
		 *  the specified arithmetic operator operation: addition,
		 *   subtraction, multiplication or division of the two
		 *    numbers. Finally, it displays the result.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int A = input.nextInt();
		System.out.println("Enter Second integer: ");
		int B = input.nextInt();
		System.out.println("Enter your operator (+ - * /): ");
		char choice = input.next().charAt(0);
		
		switch(choice) {
		case '+':
			int sum = A+ B;
			System.out.println("Sum is "+ sum);
			break;
		case '-':
			int sub = A - B;
			System.out.println("Sub is "+ sub);
			break;
		case '*':
			int mul = A*B;
			System.out.println("Mul is "+ mul);
			break;
		case '/':
			int div = A/B;
			System.out.println("Div is "+ div);
			break;
		default:
			System.out.println("Wrong choice");
		}
		
		

	}

}
