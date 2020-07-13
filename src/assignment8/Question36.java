package assignment8;

//36.	Write a function to find duplicate elements in an array.
 
public class Question36 {
	
	public static void duplicate(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i] + " ");
				}
				
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		int [] arr = new int []{5, 7, 5, 50, 8, 7, 43, 44};
		duplicate(arr);
	}

}
