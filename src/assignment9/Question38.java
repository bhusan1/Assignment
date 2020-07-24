package assignment9;

import java.util.Scanner;

//38.	Write a program to check whether given string 
// is palindrome or not.

public class Question38 {

	static boolean PalindromeCheck(String s) {
		int i = 0;
		int j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) 
				return false;
			
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String to check if palindrome: ");
		String s = in.next();
		System.out.println(s);
		if (PalindromeCheck(s))
			System.out.println(s + " is a palindrome.");
		else
			System.out.println(s + " is not a palindrome");
		in.close();
	}

}
