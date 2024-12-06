package org.grotech.assignments;
/*
 * Write a program to perform addition, multiplication, 
subtraction, and division using a custom Math class
 */

public class CustomMath {
	
	 static void addExact(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	
	static void subtractExact(int a,int b) {
		System.out.println("subtact:"+(a-b));
	}
	static void multiplyExact(int a,int b) {
		System.out.println("multiply:"+(a*b));
	}
	
	static void floorDiv(int a,int b) {
		System.out.println("division:"+(a/b));
	}
	static void floorMod(int a, int b) {
		System.out.println("modulus:"+(a%b));
	}
	void floorMod(long a, long b) {
		System.out.println("modulus:"+(a%b));
	}
	public static void main(String[] args) {
		//CustomMath cm = new CustomMath();
		//cm.floorMod(12, 10);
		addExact(10, 20);
		subtractExact(20,10);
		multiplyExact(10, 0);
		floorDiv(20, 5);
		floorMod(25, 10);
	}
	
	
}
