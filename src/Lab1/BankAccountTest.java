package Lab1;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Account holder name: ");
		String name = input.next();
		
		boolean exit = false;
		
		do {
			System.out.println("What would you like to do? ");
			System.out.println("1. Deposit /n 2. Deposit with interest ");
			System.out.println("3. Withdraw/n 4. Withdraw with fee");
			System.out.println("5. Check Balance ");
			System.out.println("6. Exit ");
			int choice = input.nextInt();
			
		
		
			switch(choice) {
		
			case 1:
				//deposit
				double amount;
				System.out.println("Amount to deposit: ");
				amount = input.nextDouble();
				BankAccount bankAccount= new BankAccount(name);
				bankAccount.deposit(amount);
			
				break;
			
			case 2:
				//deposit with interest
				double amount1;
				double interest;
				System.out.println("Amount to deposit: ");
				amount1 = input.nextDouble();
				System.out.println("Enter interest rate: ");
				interest = input.nextDouble();
				BankAccount bankAccount1= new BankAccount(name);
				bankAccount1.deposit(amount1, interest);
			
				break;
			
			case 3:
				//Withdraw
				double amount2;
				System.out.println("Amount to withdraw: ");
				amount2 = input.nextDouble();
				BankAccount bankAccount2= new BankAccount(name);
				bankAccount2.withdraw(amount2);
			
				break;
			
			case 4:
				//Withdraw with fee
				double amount3;
				double fee;
				System.out.println("Amount to withdraw: ");
				amount3 = input.nextDouble();
				System.out.println("Enter fee: ");
				fee = input.nextDouble();
				BankAccount bankAccount3= new BankAccount(name);
				bankAccount3.withdraw(amount3,fee);
			
				break;
			case 5:
				//Check Balance
				BankAccount bankAccount4= new BankAccount(name);
				bankAccount4.displayInfo();
			
				break;
			
			case 6:
				exit = true;
				break;
			
			default:
				System.out.println("Wrong Choice.");
				break;
			
		}
			System.out.println();
	}while(!exit);
		
		
		
		
		
		
		
		/*BankAccount bhusanAccount =new BankAccount("Bhusan");
		bhusanAccount.deposit(5000);
		bhusanAccount.withdraw(2000);
		
		BankAccount baAccount =new BankAccount("ba", 1000);
		baAccount.deposit(5000);
		baAccount.withdraw(2000);
		*/

	}
	

}
