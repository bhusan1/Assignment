package assignment3;

public class question11a {

	public static void main(String[] args) {
		// 11.	Write a program to swap two numbers using temp variable
		
		System.out.println("Original Numbers!!");
		int a =5, b= 6;
		int c = a;// c is a temp variable
		
		System.out.println("a is: " + a);
		System.out.println("b is: " + b);
		System.out.println("After Swap: ");
		
		a= b; // value of a is switched to b.
		b= c; // value of b is switched to c which was earlier equal to a.
		
		System.out.println("a is: "+ a);
		System.out.println("b is: "+ b);
	}

}
