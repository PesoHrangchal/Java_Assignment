import java.util.Scanner;

public class Prime {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		boolean prime=true;
		if(a!=1||a!=2) {
			for(int i=2;i<a/2;i++) {
				if(a%i==0) {
					prime=false;
			}
		}
		if(prime==true) {
			System.out.print("Prime Number");
		}else {
			System.out.print("Not Prime Number");
		}
	}
 }
}
