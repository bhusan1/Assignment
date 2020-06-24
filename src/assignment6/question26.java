package assignment6;

public class question26 {

	public static void main(String[] args) {
		// 26.	Write a Program to reverse the given number.
		//Ex : 123 => 321
		
		int num = 7898;
		int revNum = 0;
		
		while (num != 0) {
			
			revNum = revNum * 10;
			revNum = revNum + num%10;
			num = num/10;
		}
		
		System.out.println(" Reverse number is: "+ revNum);
		

	}

}
