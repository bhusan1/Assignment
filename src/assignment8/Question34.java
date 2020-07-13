package assignment8;

//34.	Write a program to reverse the element of an array.

public class Question34 {
	
	public static int[] revArray(int [] arr) {
		
		int[] reverse = new int[arr.length];
		int a = arr.length -1;
		for(int i = 0; i < arr.length;i++) {
			
			reverse[i] = arr[a];
			a--;
			
		}
		return reverse;
		
	}
	
	public static void printArray (int arr[]) {
		
		for (int i = 0; i < arr.length; i ++ ) {
			System.out.println(arr[i]+ " ");
			
		} 
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		int [] oldArray = {23,42,56,20,5,47};
		int [] reversedArray = revArray(oldArray);
		
		printArray(oldArray);
		printArray(reversedArray);
	}

}
