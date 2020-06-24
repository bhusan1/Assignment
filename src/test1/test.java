package test1;

import java.util.Scanner;

import test1.assignment8;

public class test {
	
	//this takes methods from assignment 8 and finds prime, factorial, table
		//reverse

		public static void main(String[] args) {
			
			assignment8 ob = new assignment8();
			Scanner input = new Scanner(System.in);
			String decision = "";
			
			do {
				System.out.println("Which operation do you want to perform: ");
				String choice = input.next();
				
				
				switch (choice) {
				case "table": 
					System.out.println("Enter number to find the table: ");
					int n = input.nextInt();
					ob.printTable(n);
					break;
				
				case "factorial": 
					System.out.println("Enter number to find the factorial: ");
					n = input.nextInt();
					ob.findFactorial(n);
					break;
					
				case "prime": 
					System.out.println("Enter number to find the prime: ");
					n = input.nextInt();
					ob.isPrime(n);
					break;
				
				default:
					System.out.println("wrong choice!!!!");
				}
				
				System.out.println("do you want continue?");
				decision = input.next();
				
				
			}while(decision.equals("Yes")|| decision.equals("yes")); 
			
			System.out.println("Thanks. Bye Bye!!! See You Next Time.");
			input.close();

		}


}
