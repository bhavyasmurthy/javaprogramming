package org.grotech.assignments;

/*"Assignment 59 
Write a program where the non static global variable datatype
 used are same as local variable. 
 Use non static method to use the local variable in method. 
 Use this key word to update the global variable value same as local variable."
 * 
 */
public class Assignment59 {
	int a;
	int b;

	void addVal(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);

	}

	public static void main(String[] args) {
		Assignment59 a59 = new Assignment59();

		a59.addVal(10, 20);
		System.out.println(a59.a + " " + a59.b);
	}

}
