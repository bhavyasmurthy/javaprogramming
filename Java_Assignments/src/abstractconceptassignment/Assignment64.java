package abstractconceptassignment;

/* "Assignment 64 
Write a program which contains 1 abstract class,
 inside that abstract class mention 2 abstract method, 1 concrete non static method, 1 concrete static method. 
 override the non static methods(abstract menthods+non static concrete method) 
 and call all the methods in main method to execute."
 * 
 */
abstract class One {
	abstract void add();

	abstract void subtract();

	void mul() {
		System.out.println("concrete non static method");
	}

	static void div() {
		System.out.println("concrete static method");
	}
}

public class Assignment64 extends One {
	@Override
	void add() {
		System.out.println("abstract method1");

	}

	@Override
	void subtract() {
		System.out.println("abstract method2");

	}

	public static void main(String[] args) {
		Assignment64 a64 = new Assignment64();
		a64.add();
		a64.subtract();
		div();
		a64.mul();

	}

}
