package Assignment;

import java.util.Scanner;

/*
 * 1.write a java program to print sum of odd numbers upto N?
 */
public class SumOfOdd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n=sc.nextInt();
		int sum=n*n;
		//OR
		/*int sum=0;
		int a=1;
		for(int i=1;i<=n;i++) {
			sum+=a;
			a+=2;
		}*/
		System.out.print("Sum= "+sum);
		}
}
