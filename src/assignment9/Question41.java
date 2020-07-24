package assignment9;

// 41.	Write a program to find the duplicate letter in a word

public class Question41 {
	
	 static void duplicate(String s) {
		 int count = 0;
		 
		 char[] arr = s.toCharArray();
		 
		 
		 for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]== arr[j]) {
					System.out.println(arr[j]);
					count++;
					break;
				}
			}
		 }
	 }
	
	public static void main(String[] args) {
		String name = "schools";
		duplicate(name);
		
	}

}
