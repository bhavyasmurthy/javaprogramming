package org.grotech.assignments;
/*"Assignment 25
Write a program on method Overloading and constructor overloading"
 * 
 */
public class Assignment25 {
	Assignment25(){
		System.out.println("Default constructor");
	}
	Assignment25(String name){
		System.out.println("Name:" +name);
	}
	static void addEmployee(char c1) {
		System.out.println(c1);
	}
	static void addEmployee(int age,double area) {
		System.out.println("Age:"+age+" "+"area:" +area);
	}
	void addEmp(int a,int b) {
		System.out.println(a+b);
	}
	void addEmp(int x, double y) {
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		new Assignment25("Muttu");
		Assignment25 a25 = new Assignment25();
		addEmployee('I');
		addEmployee(2, 1.20);
		a25.addEmp(10, 20);
		a25.addEmp(20,23.45);
	}

}
