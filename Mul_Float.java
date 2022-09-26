import java.util.Scanner;

public class Mul_Float {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two floating-point number:");
		float a=sc.nextInt();
		float b=sc.nextInt();
		float product=a*b;
		System.out.println("Product="+product);
	}
}
