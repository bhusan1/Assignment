package assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {
	
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
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = input.nextInt();
		int array[] = new int[size];
		
		for(int i = 0; i <size;i ++) {
			System.out.println("Enter elements: ");
			array[i] = input.nextInt();
		}
		ascendingArray(array);
		System.out.println(Arrays.toString(array));

	}

}
