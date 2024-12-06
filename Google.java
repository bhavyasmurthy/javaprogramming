package inhertanceassignment;

/*
 * "Assignment 53
Write a program for constructor inheritance using the super calling statement with Implicit Invocation"
 */
class Amazon {
	Amazon() {
		System.out.println("constructor1");
	}
}

public class Google extends Amazon {
	Google() {
		super();
		System.out.println("constructor2");
	}

	public static void main(String[] args) {
		new Google();

	}

}
