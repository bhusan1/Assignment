package assignment8;

import java.util.Arrays;

//35.Write a function to find second largest number in given array.

public class Question35 {
	
	
	
	public static void ascendingArray(int ...arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for( int j = i+1; j < arr.length; j++) {
				if (arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i] = arr [j];
					arr[j] = temp;	
				}
			}
		}
		System.out.println("Array in ascending order");
		System.out.println(arr[arr.length - 2]);//choose second last from the array list in ascending order
	}
	
	

	public static void main(String[] args) {
		
		int [] arr = new int []{5, 7, 50, 43, 44};
		
		System.out.println(Arrays.toString(arr));
		ascendingArray(arr);
		
		
		

	}

}
