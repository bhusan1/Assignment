package assignment2;

import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		/*7.	Write a program that read the radius and 
		 * length of a cylinder and computes volume.
		 */
		
		Scanner value = new Scanner (System.in);
		
		
		System.out.println("Enter radius: ");
		int r = value.nextInt();
		
		System.out.println("Enter length: ");
		int l = value.nextInt();
		
		
		double PI = Math.PI;
		
		double area_Circle = PI*(Math.pow(r, 2));
				
		double volume = area_Circle * l;
		
		
		System.out.println("Volume of Cylinder is: "+ volume);
		

	}

}
