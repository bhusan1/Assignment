package assignment10;

// 43.	Write a program to trap the exception handling to 
// trap the divided by zero and out of index value in array.

public class Question43 {

	
	public static void main(String[] args) {
		
		// out of index exception
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[8] = 9;
	        System.out.println(a[8]);
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
		
		// arithmetic exception
		 try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("Cannot divide a number by zero");
	      }
	   }
 }


