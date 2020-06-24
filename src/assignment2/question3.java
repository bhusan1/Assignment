package assignment2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class question3 {

	public static void main(String[] args) {
		
		/*3.	Write a program to find sum and average of two
		 *  numbers input by User (using Scanner class).
		 */
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
		
		int sum = a+ b;
		
		float avg = (float) (a+b)/2;
		
		JOptionPane.showMessageDialog(null, "Sum of " + a + " and " + b + " is " + sum );
		JOptionPane.showMessageDialog(null, "Average of " + a + " and " + b + " is " + avg );

		/////////////////////////////////////////////
		
		
		//Another way using Scanner is
	
		Scanner num = new Scanner(System.in);
		System.out.println("Enter m : ");
		
		int m = num.nextInt();
		
		System.out.println("Enter n: ");
		int n = num.nextInt();
		
		int sum1 = m + n;
		
		System.out.println("Sum is: " + sum1);
		
		float avg1 = (float) (m+n)/2;
		
		System.out.println("Average is: " + avg1);
		
	}

}
