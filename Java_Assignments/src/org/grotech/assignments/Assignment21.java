package org.grotech.assignments;

/*create a class consist of static , 
Non Static and constructor method 
and call each of them in a non parameterized way.
*/
public class Assignment21 {
	Assignment21() {
		System.out.println("This is a constructor");
	}

	static void add() {
		System.out.println("static method ");
	}

	void addition() {
		System.out.println("non static method");
	}

	public static void main(String[] args) {
		Assignment21 a21 = new Assignment21();
		//new Assignment21();
		a21.addition();
		add();

	}

}
