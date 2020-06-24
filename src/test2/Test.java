package test2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int choice1;
		int choice2;
		int numItem = 0;
		BhusanTakeOut.input = new Scanner(System.in);
		
		do {
			BhusanTakeOut.displayMainMenu();
			choice1 = BhusanTakeOut.input.nextInt();
			
			if (choice1 == 1) {//Italian
				
				BhusanTakeOut.displayItalianFoodMenu();
				choice2 = BhusanTakeOut.input.nextInt();
				
				switch (choice2) {
				case 1: 
					
					yield type;
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + key);
				}
			}else if (choice1 == 2) {
				
				
			}
			

	}

}
	
}
