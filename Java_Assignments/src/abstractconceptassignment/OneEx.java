package abstractconceptassignment;
/* Assignment 64 Write a program which contains 1 abstract class,
 *  inside that abstract class mention 2 abstract method, 
 *  1 concrete non static method, 1 concrete static method. 
 *  override the non static methods(abstract menthods+non static concrete method) 
 *  and call all the methods in main method to execute.
 */

abstract class Two {
	abstract void login();

	abstract void registration();

	void mul() {
		System.out.println("concrete non static");
	}

	static void div() {
		System.out.println("concrete static");

	}

}

public class OneEx extends Two {
	void login() {
		System.out.println("API1");

	}

	void registration() {
		System.out.println("API2");

	}

	public static void main(String[] args) {
		OneEx on = new OneEx();
		on.login();
		on.registration();
		on.mul();
		div();

	}

}
