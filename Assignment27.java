package org.grotech.assignments;
/*
 * "Assignment 27
 Write a program to create a class with 5 methods
  addition, subtraction, multiplication, division, modulus. 
  Create 2 global variable a & b and perform the operation without involving 3rd variable."
 */

public class Assignment27 {
	static int a;
	static int b;
	//int x;
	//int y;
	static void add() {
		System.out.println("add:"+(a+b));
	}
	static void sub() {
		System.out.println("sub:"+(a-b));
	}
	static void mul() {
		System.out.println("mul:"+a*b);
	}
	void div() {
		System.out.println("Div:"+(a/b));
	}
	void mod() { // non static non parameterized
		System.out.println("Mod:"+(a%b)); //here non static method is accessing a parameterized variable
	}
	public static void main(String[] args) {
		Assignment27 a27 = new Assignment27();
		a=10;
		b=2;
		add();
		sub();
		mul();
		a27.div();
		a27.mod();
	}
}

	