import java.util.Scanner;

public class Factorial {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int fact=a;
		for(int i=a-1;i>0;i--) {
			fact*=i;
		}
		System.out.println("Factorial of "+a+"="+fact);
	}
}
