import java.util.Scanner;

public class Multiply {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int product=a*b;
		System.out.println("Product="+product);
	}
}
