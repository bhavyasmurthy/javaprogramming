package inhertanceassignment;

/*
 * "Assignment 55
Write a program for constructor inheritance- single level 
using a parameterized super calling statement with explicit invocation"
 */
class Google_Auth {
	Google_Auth(String s1) {
		System.out.println("constructor2");
	}

}

public class Assignment55 extends Google_Auth {
	Assignment55(int i) {
		super("Vaishu");
		System.out.println("constructor1");
	}

	public static void main(String[] args) {
		System.out.println("parameterized super calling statement with explicit invocation\"");

		new Assignment55(5);

	}

}
