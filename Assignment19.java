package org.grotech.assignments;
//Write a program to call a Parametrized method using Non-Static Method.
public class Assignment19 {

	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(double a, int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Assignment19 a19 = new Assignment19();
		a19.add(30, 10);
		a19.sub(4.576514,12);

	}

}
