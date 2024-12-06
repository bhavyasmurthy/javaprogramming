package inhertanceassignment;

/*
 * "Assignment 54
Write a program for constructor - 
single level inheritance using a non-parameterized super calling statement with explicit invocation"
 */
class Google1 {
	Google1() {
		System.out.println("constructor2");
	}
}

public class Assignment54 extends Google1 {
	Assignment54() {
		super();
		System.out.println("constructor1");
	}

	public static void main(String[] args) {
		new Assignment54();

	}

}
