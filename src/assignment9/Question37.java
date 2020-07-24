package assignment9;

public class Question37 {

	//matrix addition
	
	public static void main(String[] args) {
		int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9}}; // array1
		int [][] arr2 = {{4,5,6},{2,7,8},{3,1,9}}; // array2
		
		
		int sum[][] = new int[3][3]; // initialize sum array
		
		for (int i = 0; i < 3; i++) { //
			for (int j = 0; j < 3; j++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println(); // adding line 
		}

	}

}
