package assignment3;

import java.util.Scanner;

public class question10b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter side A: ");
		double a = input.nextDouble();
		
		System.out.println("Enter side B: ");
		double b = input.nextDouble();
		
		System.out.println("Enter side C: ");
		double c = input.nextDouble();

		double s = (a + b+ c)/2;
		
		double AreaSq = s * (s-a)* (s-b)* (s-c);
		
		double Area = Math.sqrt(AreaSq);
		
		System.out.println("Area of Triangle is: " + Area);
		
	}

}
