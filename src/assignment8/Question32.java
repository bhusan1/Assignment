package assignment8;

import java.util.Scanner;

public class Question32 {
	
	public static void arraySum(int ...arr) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		System.out.println("sum is "+ sum);
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] ar = new int[5];
		for(int i = 0; i <ar.length;i ++) {
			System.out.println("Enter elements: ");
			ar[i] = input.nextInt();
		}
		
		arraySum(ar);
		input.close();

	}

}
