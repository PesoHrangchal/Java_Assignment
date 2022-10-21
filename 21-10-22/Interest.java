package Assignment;

import java.util.Scanner;

/*
 * Q.3..Write a Java method to compute the future investment 
value at a given interest rate for a specified number 
of years. */
public class Interest {
	static double Future_Invest(double amt,double rate,double year) {
		double future_value=amt*(Math.pow((1+rate/100),year));
		return future_value;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter investment amount:");
		double inAmt=sc.nextDouble();
		System.out.println("Enter rate of interest:");
		double rate=sc.nextDouble();
		System.out.println("Enter number of years:");
		double year=sc.nextDouble();
		System.out.print("Future Value="+Future_Invest(inAmt,rate,year));
	}
}
