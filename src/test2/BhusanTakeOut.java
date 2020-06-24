package test2;

import java.util.Scanner;

public class BhusanTakeOut {
	
	
	static double subtotal, tax, tip, grandTotal, perPerson;
	static int trays, leftOvers;
	
	
	
	static Scanner input = new Scanner(System.in);

	
	public static void displayMainMenu() {
		System.out.println("Choose Type Of Meal: \n1. Italian \n2.Chinese \n3.American");
		
	}
	
	public static void displayItalianFoodMenu() {
		System.out.println("Choose one: \n1. Lasagna Tray- Feeds 5- 17.99 \n2. Pizza Pack- Feeds 7- 15.99 \n3. Gazpacho Soup, salad and bread sticks pack- Feeds 4-12.99 \nEnter Choice");
		
	}
	
	public static void displayChineseFoodMenu() {
		System.out.println("Choose one: \n1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls)- feeds 7-	18.99 \n2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls)- feeds 7- 18.99 \n3. Shrimp Fried Rice Tray (includes 10 egg rolls)- Feeds 5- 10.99 \nEnter Choice ");
		
	}
	
	public static void displayAmericanFoodMenu() {
		System.out.println("Choose one: \n1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8- 21.99 \n2. Grilled Chicken Sandwich and Mozzarella Sticks Tray- includes dipping sauces -Feeds 5- 22.99 \n3. Barbeque Tray- includes buns and peach cobbler- Feeds 10- 26.99 \nEnter Choice ");
	
	}
	
	
	
	public static int determineTrays(int people, int feeds) {
		
		trays = people/ feeds;
		return trays;
		
		
	}
	
	public static double getSubtotal(double price, int trays) {
		
		subtotal = price * trays;
		return subtotal;
		
		
	}
	
	public static double getTax(double subtotal, double taxrate) {
	
		taxrate = 13/100;
		tax = subtotal* taxrate;
		return tax;
		
	}
	
	public static double getTip(double subtotal, double tipRate) {
		tip = (subtotal*7)/100;
		return tip;
		
	}
	
	public static double getGrandTotal(double subtotal, double tax, double tip) {
		
		grandTotal = subtotal + tip + tax;
		return grandTotal;
	}
	
	public static double pricePerPerson(double grandTotal, int people){
		
		perPerson = grandTotal/people;
		return perPerson;
	}
	
	public static int determineLeftOvers( int feeds, int trays, int people) {
		
		leftOvers = (trays* feeds)% people;
		return leftOvers;
		
	}
	 
	
	

}
