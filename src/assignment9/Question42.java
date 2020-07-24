package assignment9;

import java.util.Scanner;

//42.	Write a program to find the duplicate word from long string.

public class Question42 {
	
	public static void LongStr(String s1) {
		
		String[] arr = s1.split(" ");
		for (int i =0; i< arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("the duplicate word is: "+ arr[i]);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a long sentence with duplicate word: ");
		String sent = input.nextLine();
		
		LongStr(sent);
		
		
	}
}
