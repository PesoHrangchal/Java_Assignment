import java.util.Scanner;

public class Leap_Year {
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		boolean Leap_Year=false;
		if(a%400==0)
			Leap_Year=true;
		else if(a%100==0)
			Leap_Year=false;
		else if(a%4==0)
			Leap_Year=true;
		else
			Leap_Year=false;	
		if(Leap_Year==true)
			System.out.print("Leap Year.");
		else
			System.out.print("Not Leap Year.");
	}
}
