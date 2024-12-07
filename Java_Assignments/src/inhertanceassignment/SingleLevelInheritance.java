package inhertanceassignment;
/* "Assignment 48
Write a program for single-level inheritance using a static method
 in the same class name in the single package explorer."
 * 
 */
class Parent{
	static void add() {// static non parameterized method
		System.out.println("Addition");
	}
	static void sub() {
		System.out.println("subtraction");
	}
	static void login(String Username, String password) { // static  parameterized method
		System.out.println("Login");
	}
}

public class SingleLevelInheritance extends Parent {

	public static void main(String[] args) {
		add();
		sub();
		login("bhavyasmurthy@gmail.com","hello123");

	}

}
