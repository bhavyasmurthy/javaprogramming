package org.grotech.assignments;

/* "Assignment 26
 Write a program to update value of local and static global variable
  and non static global variable."
 * 
 */
public class Assignment26 {
	static int a = 100;
	double b = 56.98;

	public static void main(String[] args) {
		int k = 6;
		a = 10;
		k = 20;
		Assignment26 a26 = new Assignment26();
		a26.b = 32.8;

		System.out.println("updated global 'a' value:" + a);
		System.out.println("updated global 'b' value:" + a26.b);
		System.out.println("updated global 'k' value:" + k);

	}
}
