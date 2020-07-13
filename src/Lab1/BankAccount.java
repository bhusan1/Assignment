package Lab1;

public class BankAccount {
	
	private String name;
	private static int accountNumber=0;
	private int accountNum;
	private double initialBalance;
	
	
	public BankAccount(String name) {
		this.name = name;
		this.initialBalance= 0;
		this.accountNum = accountNumber++;
		displayInfo();
	}
	
	public BankAccount(String name, double initialBalance) {
		this.name = name;
		this.initialBalance= initialBalance;
		this.accountNum = accountNumber++;
		displayInfo();
	}
	
	public void deposit(double amount) {
		initialBalance = initialBalance + amount;
		displayInfo();
	}
	
	public void deposit(double amount, double interest) {
		initialBalance = initialBalance + amount;
		initialBalance = initialBalance + (initialBalance*interest/100);
		displayInfo();
	}

	public void withdraw(double amount) {
		initialBalance = initialBalance - amount;
		displayInfo();
	}
	
	public void withdraw(double amount, double fee) {
		initialBalance = initialBalance - amount - fee; 
		displayInfo();
	}
	
	
	
	public void displayInfo() {
		
		System.out.println("=======================");
		System.out.println("Account name is:" + name);
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Balance is: "+ initialBalance );
		
		System.out.println("=======================");
		
		
		
	}
	

}
