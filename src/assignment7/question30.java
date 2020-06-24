package assignment7;

import java.util.Scanner;

public class question30 {
	
	//30.Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

	
	public void fib(int n) {
		int t = 0, u = 1;
		
		while (t <= n) {
			System.out.print(t + " ");
			
			int fib = t + u;
			t = u;
			u = fib;
		}
    }
       
    public static void main (String args[])  {
    	
    	question30 ob = new question30();
    	System.out.println("Enter a number to print fibonacci series: ");
		
    	Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		ob.fib(n); 
    } 

}
