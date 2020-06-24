package assignment2;

import java.util.Scanner;

public class question5 {

	public static void main(String[] args) {
		
		/*5.	Write a program to find the area of circle, 
		 * rectangle, and triangle.
		 */
		
		
		Scanner value = new Scanner (System.in);
		
		//for circle
		System.out.println("Enter radius: ");
		int r = value.nextInt();
		
		double PI = Math.PI;
		
		double area_Circle = PI*(Math.pow(r, 2));
		
		System.out.println("Area of Circle is: "+ area_Circle);
		
		//for rectangle
		System.out.println("Enter length: ");
		int l = value.nextInt();
		
		System.out.println("Enter breadth: ");
		int b = value.nextInt();
		
		double area_Rect = l * b;
		System.out.println("Area of rectangle is: " + area_Rect );
		
		//for triangle
		System.out.println("Enter Base: ");
		int base = value.nextInt();
		
		System.out.println("Enter Height: ");
		int h = value.nextInt();
		
		double area_Tri = (b * h)/2;
		
		System.out.println("Area of triangle: " + area_Tri );
		


	}

}
