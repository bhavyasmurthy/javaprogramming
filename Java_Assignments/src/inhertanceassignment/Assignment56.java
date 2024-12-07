package inhertanceassignment;
/*
 * "Assignment 56
Write a program for constructor inheritance- Multi level
using a parameterized super calling statement with explicit invocation"
 */
class Y{
	Y(int a){
		System.out.println("constructor3");
	}
}
class X extends Y{
	X(){
		super(100);
		System.out.println("constructor2");
	}
}
public class Assignment56 extends X {
	Assignment56() {
		super();
		System.out.println("constructor1");
		
	}

	public static void main(String[] args) {
		
		new Assignment56();

	}

}
