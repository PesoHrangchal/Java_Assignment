package Assignment;
//this type of inheritance is called Multi-level Inheritance.
//Example is given below
class A {//base class of derived class B
	public void show() {
		 System.out.println("This is class A");
	 }
}

class B extends Problem2{//derived class from A and base class for class C
	public void show1() {
		 System.out.println("This is class B");
	 }
}

class C extends B{//derived class from B
	public void show2() {
		 System.out.println("This is class C");
	 }
}

public class Problem2{
	public static void main(String args[]) {
		C obj=new C();
		//obj.show();
		obj.show1();
		obj.show2();
		
	}
}
