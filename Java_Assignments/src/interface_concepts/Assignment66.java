package interface_concepts;

/* "Assignment 66
Write a program to create relationship between class and abstract class , 
abstract class and interface(Multi level inheritence)"
 * 
 */
interface Two {
	void add();

	void sub();
}

abstract class One1 implements Two {
	abstract void mul();

	abstract void div();
}

public class Assignment66 extends One1 {
	@Override
	public void add() {
		System.out.println("Actual logic by developer");

	}

	@Override
	public void sub() {
		System.out.println("Actual logic by developer");

	}

	@Override
	void mul() {
		System.out.println("multiply");
	}

	@Override
	void div() {
		System.out.println("divide");
	}

	public static void main(String[] args) {
		Assignment66 a66 = new Assignment66();
		a66.add();
		a66.sub();
		a66.mul();
		a66.div();
	}

}
