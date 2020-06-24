package assignment7;

public class question30 {
	
	//30.Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

	
	public static int fib(int n) 
    { 
    if (n <= 1) 
       return n; 
    return fib(n-1) + fib(n-2); 
    } 
       
    public static void main (String args[]) 
    { 
    int n = 9; 
    System.out.println(fib(n)); 
    } 

}
