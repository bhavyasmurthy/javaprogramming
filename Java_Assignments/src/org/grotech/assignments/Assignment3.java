package org.grotech.assignments;
//arithematic operations
public class Assignment3 {
	static void add() {
		int a = 20;
		int b = 10;
		int sum = a+b;
		System.out.println("Add:"+sum);
	}
	static void sub() {
		int a = 20;
		int b = 10;
		int minus = a-b;
		System.out.println("subtract:"+minus);
	}
	static void mul() {
		int a = 20;
		int b = 10;
		int mul = a*b;
		System.out.println("multiply:"+mul);
	}
	static void div() {
		int a = 20;
		int b = 10;
		int div = a/b;
		System.out.println("divide:"+div);
	}
	static void mod() {
		int a = 20;
		int b = 7;
		int mod = a%b;
		System.out.println("modulus:"+mod);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}
}
