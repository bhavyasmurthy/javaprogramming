package org.grotech.assignments;

import java.util.Scanner;

/*"Assignment 37
Write a program to do Addition,Subtraction,Multiplication,
and Division and Modulus using Scanner class with 2 variables" 
 */

public class Assignment37 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s1.nextInt();
		System.out.println("Enter b value");
		int b = s1.nextInt();
		System.out.println("Addition:" + (a + b));
		System.out.println("Subtraction:" + (a - b));
		System.out.println("multiply:" + (a * b));
		System.out.println("divide:" + (a / b));
		System.out.println("modulus:" + (a % b));

		System.out.println("Enter your name:");
		String s2 = s1.next();
		System.out.println("name:" + s2);

	}

}
