package test2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int choice1;
		int Italian;
		int Chinese;
		int American;
		int numItem = 0;
		int people = 1 ,feeds =1;
		int trays = 0;
		double price= 0.0 , subtotal= 0.0, taxrate = 0.0 ;
		BhusanTakeOut.input = new Scanner(System.in);
		
		do {
			BhusanTakeOut.displayMainMenu();
			choice1 = BhusanTakeOut.input.nextInt();
			
			if (choice1 == 1) {//Italian
				
				BhusanTakeOut.displayItalianFoodMenu();
				Italian = BhusanTakeOut.input.nextInt();
				
				switch (Italian) {
				case 1: 
					System.out.println("You have ordered Lasagna Tray");
					numItem = 1;
					feeds = 5;
					price = 17.99;
					break;
					
				case 2: 
					System.out.println("You have ordered Pizza Pack");
					numItem = 2;
					feeds = 7;
					price = 17.99;
					break;
					
				case 3: 
					System.out.println("You have ordered Gazpacho");
					numItem = 3;
					feeds = 4;
					price = 17.99;
					break;
				
				default:
					System.out.println("Wrong choice");
				}
				break;
				
			}else if (choice1 == 2) {//Chinese
				BhusanTakeOut.displayChineseFoodMenu();
				Chinese = BhusanTakeOut.input.nextInt();
				
				switch (Chinese) {
				case 1: 
					System.out.println("You have ordered Chicken");
					numItem = 1;
					feeds = 7;
					price = 17.99;
					break;
					
				case 2: 
					System.out.println("You have ordered Pork");
					numItem = 2;
					feeds = 7;
					price = 17.99;
					break;
					
				case 3: 
					System.out.println("You have ordered Shrimp");
					numItem = 3;
					feeds = 5;
					price = 17.99;
					break;
				
				default:
					System.out.println("Wrong choice");
				
				}
				break;
				
			}else if(choice1 == 3){//American
				BhusanTakeOut.displayAmericanFoodMenu();
				American = BhusanTakeOut.input.nextInt();
				
				switch (American) {
				case 1: 
					System.out.println("You have ordered Hamburger");
					numItem = 1;
					feeds = 8;
					price = 17.99;
					break;
					
				case 2: 
					System.out.println("You have ordered chicken");
					numItem = 2;
					feeds = 5;
					price = 17.99;
					break;
					
				case 3: 
					System.out.println("You have ordered Barbeque");
					numItem = 3;
					feeds = 10;
					price = 17.99;
					break;
				
				default:
					System.out.println("Wrong choice!!!!");
				
				}
				break;
				
				
			}else {
				System.out.println("Wrong Choice!!!");
				break;
				
			}
			
			
			
		}while (choice1 >0 && choice1 <4);
		
		BhusanTakeOut.determineTrays(people, feeds);
		System.out.println("Enter number of people: ");
		people = BhusanTakeOut.input.nextInt();
		
		
		System.out.println("You need " + BhusanTakeOut.trays + " trays." );
		
		System.out.println("Feeds: "+ feeds);
		
		BhusanTakeOut.getSubtotal(price, trays);
		System.out.println("Price for " + people + " people: " + price);
		
		BhusanTakeOut.getTax(subtotal, taxrate);
		System.out.println("Tax: " );
		
		
		
		
		
		
		
		
		
		


}
	
	
}
