package assignment3;

public class question11b {

	public static void main(String[] args) {
		// 11.	Write a program to swap two numbers without using temp variable

		int a = 5, b = 6;
		System.out.println("Originally!!");
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println("After Swap: ");
		
		a = a + b;//makes a= 11
		b = a - b;// makes b = 11-6 = 5
		a = a -b; // makes a = 11-5 = 6
	
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		
	}

}
