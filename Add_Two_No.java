import java.util.Scanner;

public class Add_Two_No {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number to add:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("Sum="+add);
	}
}
