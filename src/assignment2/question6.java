package assignment2;

import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		
		/*6.	Write a program to find the perimeter of 
		 * circle, triangle, and rectangle.
		 */
		
		Scanner value = new Scanner (System.in);
		
		//for circle
		System.out.println("Enter radius: ");
		int r = value.nextInt();
		
		double PI = Math.PI;
		
		double peri_Circle = 2*PI*r;
		
		System.out.println("Perimeter of Circle is: "+ peri_Circle);
		
		//for rectangle
		System.out.println("Enter length: ");
		int l = value.nextInt();
		
		System.out.println("Enter breadth: ");
		int b = value.nextInt();
		
		double peri_Rect = 2*(l + b);
		System.out.println("Perimeter of rectangle is: " + peri_Rect );
		
		//for triangle
		System.out.println("Enter Side A: ");
		int A = value.nextInt();
		
		System.out.println("Enter Side B: ");
		int B = value.nextInt();
		
		System.out.println("Enter Side C: ");
		int C = value.nextInt();
		
		double peri_Tri = A + B + C;
		
		System.out.println("Perimeter of triangle: " + peri_Tri );
		



	}

}
