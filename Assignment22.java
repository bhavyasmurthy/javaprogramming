package org.grotech.assignments;

// constructor overloading
public class Assignment22 {
	Assignment22(int a, int b) {
		System.out.println("add:" + (a + b));
	}

	Assignment22(int a, double d) {
		System.out.println("Subtract:" + (a - d));
	}

	Assignment22(int a, char c, double d) {
		System.out.println("constructor 1");
	}

	Assignment22(int a, String s1, char c) {
		this(80, 34.20);
		System.out.println("constructor 2");
	}

	public static void main(String[] args) {
		new Assignment22(32, 56);
		//new Assignment22(80, 34.20);
		new Assignment22(56, 'B', 78.32);
		new Assignment22(87, "Bhavya", 'I');
	}
}
