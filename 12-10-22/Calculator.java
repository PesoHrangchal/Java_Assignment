package Assignment;
/*
 * 2.Write a java program to illustrate Calculator class with addition, subtraction,
 multiplication methods that can take any number of parameters to perform the operation, 
 without using method/constructor overloading
 *
 */
public class Calculator {
	public int addition(int...add) {
		int sum=0;
		for(int i:add) {
			sum+=i;
		}
		return sum;
	}
	public int subtraction(int...sub) {//using varargs
		int x=0;
		for(int i:sub) {//we use fore loop here
			x=i-x;
		}
		return x;
	}
	public int multiplication(int...mul) {
		int multiply=1;
		for(int i:mul) {
			multiply*=i;
		}
		return multiply;
	}
	public static void main(String[] args) {
		Calculator2 obj=new Calculator2();
		int result1=obj.addition(12,45,65,22);
		int result2=obj.subtraction(12,34);
		int result3=obj.multiplication(12,23);
		System.out.println("Addition "+result1);
		System.out.println("Subtraction "+result2);
		System.out.println("Multiplication "+result3);
	}}
