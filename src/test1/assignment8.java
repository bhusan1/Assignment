package test1;

public class assignment8 {
	
public void findFactorial(int n) {
		
		int result = 1;
		for (int i = 1; i<=n; i++){
			result = result* i; 	
		}
		System.out.println(n + "!" + "=" + result);
	}
	
	public void printTable(int num) {
		
		int result;
		for (int i = 1; i<= 10; i++){
			result = num* i;
			System.out.println(num + " * " + i + " = " + result);
			
		}
	}
	
	public boolean isPrime(int n) {
		boolean isPrimeNumber = true;
		for (int i = 2; i<=n/2; i++){
			if(n % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
			return isPrimeNumber; 	
	}

}
