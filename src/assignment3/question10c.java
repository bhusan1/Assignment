package assignment3;

public class question10c {

	public static void main(String[] args) {
		System.out.println("Program to find roots of eqn ax2 + bx + c = 0");
		
		double  a= 1.0, b = 2.0, c = 2.0;
		
		
		double t = (Math.pow(b, 2))-(4*a*c);
		
		double x = ((-b)+ t)/(2*a);
		
		System.out.println("The roots of the eqn: " + x);
	
	}

}
