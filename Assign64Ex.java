package inhertanceassignment;
/*Assignment 64 Write a program which contains 1 abstract class, 
 * inside that abstract class mention 2 abstract method, 
 * 1 concrete non static method, 1 concrete static method. 
 * override the non static methods(abstract menthods+non static concrete method) 
 * and call all the methods in main method to execute.
 * 
 */
abstract class Amazon64{
	abstract void add();
	abstract void sub();
	void mul() {
		System.out.println("3");
	}
	static void div() {
		System.out.println("4");
	}
}
public class Assign64Ex extends Amazon64 {
	void add() {
		System.out.println("1");
	}

	void sub() {
		System.out.println("2");
	}


	public static void main(String[] args) {
		Assign64Ex a = new Assign64Ex();
		a.add();
		a.sub();
		a.mul();
		div();
		
	}

	}
