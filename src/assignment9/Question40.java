package assignment9;

//40.	Write a program to reverse the string.

public class Question40 {

	public static void main(String[] args) {
		String word = "Bhusan";
		byte[] arr = word.getBytes();
		
		byte[] revArr = new byte [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			revArr[i] = arr[arr.length-i-1];
			
		}
		System.out.println(new String(revArr).toLowerCase());
	}
	}
