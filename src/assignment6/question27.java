package assignment6;

public class question27 {

	public static void main(String[] args) {
		// 27.	Write a Program to sum each digit of given number
		//as we XX ll as product. //456 =>4*5*6 and 4+5+6
		
		
		int m = 1234;
		int n; 
		int sum = 0;
		int mul = 1;
		
		while (m> 0) {
			n = m%10;
			sum = sum + n;
			mul = mul * n;
			m = m /10;
		}
		
		System.out.println("Sum of each digit is: "+ sum);
		System.out.println("Product of each digit is : "+ mul);

	}

}
