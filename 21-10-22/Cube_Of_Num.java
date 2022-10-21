package Assignment;
/*
 * Q.2..Write a program in Java to display the cube of the number
 upto given an integer..*/
import java.util.Scanner;

public class Cube_Of_Num {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of term:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Cube of "+i+":"+i*i*i);
		}
	}
}
