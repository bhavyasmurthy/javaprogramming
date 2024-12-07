package org.grotech.assignments;
// 

//Write a program using Final  variable

public class Assignment28 {
	static final double d1 = 324.49232;
	final String st = "Bhavya";

	public static void main(String[] args) {
		final char gender = 'F';
		// gender = 'f'; // local variables cannot differentiate between static and non
		// static

		final int square_root = 2;
		Assignment28 a28 = new Assignment28();
		System.out.println(gender);
		System.out.println(d1);
		System.out.println(a28.st);
		System.out.println(square_root);
	}

}
