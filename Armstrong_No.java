import java.util.Scanner;

public class Armstrong_No {
		public static void main(String Args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int a=sc.nextInt();
			int b=a;
			int sum=0;
			for(int i=b;i>0;i--) {
				sum+=(b%10)*(b%10)*(b%10);
				b/=10;
			}
			if(a==sum)
				System.out.println("Armstrong Number.");
			else
				System.out.println("Not Armstrong Number.");
		}
}
