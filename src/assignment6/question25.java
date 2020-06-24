package assignment6;

import java.util.Scanner;

public class question25 {

	public static void main(String[] args) {
		// 1.	Write a program that prompts the user to enter 
		//the number of students and each student’s name and 
		//score. Finally display the student with highest score.

		Scanner input = new Scanner(System.in);
		System.out.println(" Enter number of students: ");
		int num = input.nextInt();
		int maxScore = 0; // to record highest score
		String studentName = ""; //to record student name with high score
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter student name: ");
			String name = input.next();
			System.out.println("Enter score: ");
			int score = input.nextInt();
			
			if (score > maxScore) {
				maxScore = score;
				studentName = name;
			}
		}
		System.out.println("Student with high score is : " + studentName + " " + maxScore);
		input.close();
	}

}
