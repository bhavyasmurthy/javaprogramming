package org.grotech.assignments;

/*"Assignment 23
Write a program on method Overloading "
 */
/*
 * "Assignment 24
Write a program on method Overloading with 5 static method and 5 non static method"
 */
public class Assignment23 {
	static void add() {
		System.out.println("method overlaoding1");
	}

	static void add(String a) {
		System.out.println("method overlaoding2");
	}

	static void add(int a, int b, char c) {
		System.out.println(a * b + ":" + 'V');
	}

	static void add(int a, int b) {
		System.out.println(a * b);
	}

	static void add(char a, char b) {
		System.out.println("method overlaoding3");
	}

	void add1(String x, String y) {
		System.out.println("non static method overloading1");
	}

	void add1(int x, int y) {
		System.out.println("non static method overloading2");
	}

	void add1(String x, double d) {
		System.out.println("non static method overloading1");
	}

	void add1(byte b1) {
		System.out.println("non static method overloading1");
	}

	void add1(String x) {
		System.out.println("non static method overloading1");
	}

	public static void main(String[] args) {
		Assignment23 a23 = new Assignment23();
		a23.add1("Bhavya");
		a23.add1(null, 0);
		a23.add1(101, 100);
		a23.add1('X', 'Y');
		a23.add1("hi", 107080);
		add();
		add("Bhavya");
		add(39, 2);
		add(1, 'T');
		add(89, 90, 'V');

	}

}
